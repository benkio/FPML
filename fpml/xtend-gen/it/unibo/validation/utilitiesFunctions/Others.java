package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ChainElement;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.DataType;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.StringType;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;

@SuppressWarnings("all")
public class Others {
  public static PureFunctionDefinition getFunctionDefinitionFromPureFactor(final CompositionFunctionBodyPureFactor cfbpf) {
    PureFunctionDefinition _primitiveElement = cfbpf.getPrimitiveElement();
    boolean _equals = Objects.equal(_primitiveElement, null);
    if (_equals) {
      return cfbpf.getReferenceElement();
    } else {
      return cfbpf.getPrimitiveElement();
    }
  }
  
  public static ChainElement getFunctionDefinitionFromEffectFullFactor(final CompositionFunctionBodyEffectFullFactor cfbef) {
    ChainElement _primitiveElement = cfbef.getPrimitiveElement();
    boolean _equals = Objects.equal(_primitiveElement, null);
    if (_equals) {
      return cfbef.getReferenceElement();
    } else {
      return cfbef.getPrimitiveElement();
    }
  }
  
  public static PureFunctionDefinition getFirstFunctionDefinitionFromCompositionBodyPure(final CompositionFunctionBodyPure cfbp) {
    PureFunctionDefinition _primitiveElement = cfbp.getPrimitiveElement();
    boolean _equals = Objects.equal(_primitiveElement, null);
    if (_equals) {
      return cfbp.getReferenceElement();
    } else {
      return cfbp.getPrimitiveElement();
    }
  }
  
  public static ChainElement getFirstFunctionDefinitionFromCompositionBodyEffectFull(final CompositionFunctionBodyEffect cfbe) {
    ChainElement _primitiveElement = cfbe.getPrimitiveElement();
    boolean _equals = Objects.equal(_primitiveElement, null);
    if (_equals) {
      return cfbe.getReferenceElement();
    } else {
      return cfbe.getPrimitiveElement();
    }
  }
  
  public static PureFunctionType createIntIntFuntionType() {
    final PureFunctionType func = FPMLFactory.eINSTANCE.createPureFunctionType();
    IntegerType _createIntegerType = FPMLFactory.eINSTANCE.createIntegerType();
    func.setArgType(_createIntegerType);
    IntegerType _createIntegerType_1 = FPMLFactory.eINSTANCE.createIntegerType();
    func.setReturnType(_createIntegerType_1);
    return func;
  }
  
  public static Type getTypeFromExpression(final Expression e) {
    boolean _matched = false;
    if (e instanceof IntegerType) {
      _matched=true;
      return ((IntegerType) e);
    }
    if (!_matched) {
      if (e instanceof StringType) {
        _matched=true;
        return ((StringType) e);
      }
    }
    if (!_matched) {
      if (e instanceof UnitType) {
        _matched=true;
        return ((UnitType) e);
      }
    }
    if (!_matched) {
      if (e instanceof DataType) {
        _matched=true;
        return ((DataType) e);
      }
    }
    if (!_matched) {
      if (e instanceof PureFunctionType) {
        _matched=true;
        return ((PureFunctionType) e);
      }
    }
    return null;
  }
}
