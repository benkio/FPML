package it.unibo.generator

import it.unibo.fPML.ValueType
import it.unibo.fPML.IntegerType
import it.unibo.fPML.StringType
import it.unibo.fPML.UnitType
import it.unibo.fPML.Argument
import it.unibo.fPML.DataType
import it.unibo.fPML.EffectFullArgument
import it.unibo.fPML.Type
import it.unibo.fPML.IOType
import it.unibo.fPML.AdtType
import it.unibo.fPML.SumType
import it.unibo.fPML.ProdType
import it.unibo.fPML.Expression

class TypeGenerator {
	
	def compile(ValueType vt) '''
		«switch vt{
			DataType: return vt.type.name
			IntegerType: return vt.type
			StringType: return vt.type
		}»'''

	def compile(Argument arg) '''«arg.type.compile» «arg.name»'''
	
	def compile(EffectFullArgument arg) '''«arg.type.compile» «arg.name»'''
	
	def compile(Type t){
		switch t {
			UnitType: return '''Unit'''
			ValueType: return compile(t)
		}
	}
	
	def compile(IOType iot) {
		return '''IO<«compile(iot.type)»>'''
	}
	
	def adtTypeCompile(AdtType adtType) {
		switch adtType {
			ValueType: return (adtType as ValueType).compile 
			default: {
				if (adtType.adtElement2 instanceof SumType)
					return '''Either<«adtType.adtElement1.adtTypeCompile», «if (adtType.adtElement2 instanceof SumType) (adtType.adtElement2 as SumType).compile else (adtType.adtElement2 as ProdType).compile»>'''
				else
					return '''p(«adtType.adtElement1.adtTypeCompile», «if (adtType.adtElement2 instanceof SumType) (adtType.adtElement2 as SumType).compile else (adtType.adtElement2 as ProdType).compile»)'''
			}
		}
	}
	
	def compile(SumType st){
		return adtTypeCompile(st.adtElement)
	}
	def compile(ProdType pt){
		return adtTypeCompile(pt.adtElement)
	}
	
	def compileType(Expression e) {
		switch e {
			IntegerType: return "int"
			UnitType: return "IO<Unit>"
			StringType: return "String"
			DataType: return e.type.name
		}
	}
}