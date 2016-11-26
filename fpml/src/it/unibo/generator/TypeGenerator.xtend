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
import it.unibo.fPML.Expression
import it.unibo.fPML.PureFunctionType
import it.unibo.fPML.EffectFullFunctionType
import it.unibo.fPML.PureAdtType
import it.unibo.fPML.PureSumType
import it.unibo.fPML.PureProdType

class TypeGenerator {
	
	def compile(ValueType vt) '''
		«switch vt{
			DataType: return vt.type.name
			IntegerType: return 'Integer'
			StringType: return vt.type
			PureFunctionType: return '''F<«vt.argType.compile»,«vt.returnType.compile»>'''
		}»'''

	def compile(Argument arg) '''«arg.type.compile» «arg.name»'''
	
	def compile(EffectFullArgument arg) '''«arg.type.compile» «arg.name»'''
	
	def compile(Type t){
		switch t {
			UnitType: return '''Unit'''
			ValueType: return compile(t)
			EffectFullFunctionType: return '''F<«t.argType.compile», IO<«t.returnType.type.compile»>>'''
		}
	}
	
	def compile(IOType iot) {
		return '''«compile(iot.type)»'''
	}
	
	def pureAdtTypeCompile(PureAdtType adtType) {
		switch adtType {
			ValueType: return (adtType as ValueType).compile 
			default: {
				if (adtType.pureAdtElement2 instanceof PureSumType)
					return '''Either<«adtType.pureAdtElement1.pureAdtTypeCompile», «if (adtType.pureAdtElement2 instanceof PureSumType) (adtType.pureAdtElement2 as PureSumType).compile else (adtType.pureAdtElement2 as PureProdType).compile»>'''
				else
					return '''P2<«adtType.pureAdtElement1.pureAdtTypeCompile», «if (adtType.pureAdtElement2 instanceof PureSumType) (adtType.pureAdtElement2 as PureSumType).compile else (adtType.pureAdtElement2 as PureProdType).compile»>'''
			}
		}
	}
	
	def compile(PureSumType st){
		return pureAdtTypeCompile(st.adtElement)
	}
	def compile(PureProdType pt){
		return pureAdtTypeCompile(pt.adtElement)
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