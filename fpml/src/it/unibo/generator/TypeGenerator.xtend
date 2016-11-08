package it.unibo.generator

import it.unibo.fPML.ValueType
import it.unibo.fPML.IntegerType
import it.unibo.fPML.StringType
import it.unibo.fPML.UnitType
import it.unibo.fPML.SumType
import it.unibo.fPML.ProdType
import it.unibo.fPML.Adt
import it.unibo.fPML.Argument
import it.unibo.fPML.DataType
import it.unibo.fPML.EffectFullArgument
import it.unibo.fPML.Type
import it.unibo.fPML.IOType

class TypeGenerator {
	
	def dataCompile(ValueType vt) {
		switch vt {
			IntegerType: return '''int value = «(vt as IntegerType).value»;'''
			StringType: return '''String value = "«(vt as StringType).value»";'''
			UnitType: return '''Unit value = IOFunctions.unit;'''
		}
	}
	
	def compile(SumType st) '''Either<«st.sumAdtElements.map[t | t.functionCompile].reduce[p1, p2| p1 + ", " + p2]»>''' 
	def compile(ProdType pt) '''P2<«pt.prodAdtElements.map[t | t.functionCompile].reduce[p1, p2| p1 + ", " + p2]»>'''
	
	def compile(Adt adt) {
		switch adt {
			Argument: return (adt as Argument).compile
	  		SumType:  return (adt as SumType).compile
    		ProdType: return (adt as ProdType).compile
		}
	}
	
	
	def functionCompile(ValueType vt) '''
		«switch vt{
			DataType: return vt.type.name
			IntegerType: return vt.type
			StringType: return vt.type
		}»'''

	def compile(Argument arg) '''«arg.type.functionCompile» «arg.name»'''
	
	def compile(EffectFullArgument arg) '''«arg.type.compile» «arg.name»'''
	
	def compile(Type t){
		switch t {
			UnitType: return '''Unit'''
			ValueType: return functionCompile(t)
		}
	}
	
	def compile(IOType iot) {
		return '''IO<«compile(iot.type)»>'''
	}
	
	
}