/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.util;

import it.unibo.fPML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.unibo.fPML.FPMLPackage
 * @generated
 */
public class FPMLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FPMLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FPMLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FPMLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FPMLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.PURE_BLOCK:
      {
        PureBlock pureBlock = (PureBlock)theEObject;
        T result = casePureBlock(pureBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.PURE_FUNCTION_BLOCK:
      {
        PureFunctionBlock pureFunctionBlock = (PureFunctionBlock)theEObject;
        T result = casePureFunctionBlock(pureFunctionBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.DATA_BLOCK:
      {
        DataBlock dataBlock = (DataBlock)theEObject;
        T result = caseDataBlock(dataBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.VALUE_BLOCK:
      {
        ValueBlock valueBlock = (ValueBlock)theEObject;
        T result = caseValueBlock(valueBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.EFFECT_FULL_BLOCK:
      {
        EffectFullBlock effectFullBlock = (EffectFullBlock)theEObject;
        T result = caseEffectFullBlock(effectFullBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.DATA:
      {
        Data data = (Data)theEObject;
        T result = caseData(data);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = caseChainElement(value);
        if (result == null) result = caseInitialPureChainElement(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.ADT_TYPE:
      {
        AdtType adtType = (AdtType)theEObject;
        T result = caseAdtType(adtType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.SUM_TYPE:
      {
        SumType sumType = (SumType)theEObject;
        T result = caseSumType(sumType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.PROD_TYPE:
      {
        ProdType prodType = (ProdType)theEObject;
        T result = caseProdType(prodType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.PURE_FUNCTION_DEFINITION:
      {
        PureFunctionDefinition pureFunctionDefinition = (PureFunctionDefinition)theEObject;
        T result = casePureFunctionDefinition(pureFunctionDefinition);
        if (result == null) result = caseInitialPureChainElement(pureFunctionDefinition);
        if (result == null) result = caseFunction(pureFunctionDefinition);
        if (result == null) result = caseChainElement(pureFunctionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.EFFECT_FULL_FUNCTION_DEFINITION:
      {
        EffectFullFunctionDefinition effectFullFunctionDefinition = (EffectFullFunctionDefinition)theEObject;
        T result = caseEffectFullFunctionDefinition(effectFullFunctionDefinition);
        if (result == null) result = caseFunction(effectFullFunctionDefinition);
        if (result == null) result = caseChainElement(effectFullFunctionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.MAIN_FUNC:
      {
        MainFunc mainFunc = (MainFunc)theEObject;
        T result = caseMainFunc(mainFunc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.CHAIN_ELEMENT:
      {
        ChainElement chainElement = (ChainElement)theEObject;
        T result = caseChainElement(chainElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.INITIAL_PURE_CHAIN_ELEMENT:
      {
        InitialPureChainElement initialPureChainElement = (InitialPureChainElement)theEObject;
        T result = caseInitialPureChainElement(initialPureChainElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseChainElement(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.EFFECT_FULL_ARGUMENT:
      {
        EffectFullArgument effectFullArgument = (EffectFullArgument)theEObject;
        T result = caseEffectFullArgument(effectFullArgument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.ARGUMENT:
      {
        Argument argument = (Argument)theEObject;
        T result = caseArgument(argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.FUNCTION_BODY_PURE:
      {
        FunctionBodyPure functionBodyPure = (FunctionBodyPure)theEObject;
        T result = caseFunctionBodyPure(functionBodyPure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.FUNCTION_BODY_EFFECT_FULL:
      {
        FunctionBodyEffectFull functionBodyEffectFull = (FunctionBodyEffectFull)theEObject;
        T result = caseFunctionBodyEffectFull(functionBodyEffectFull);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.EMPTY_FUNCTION_BODY:
      {
        EmptyFunctionBody emptyFunctionBody = (EmptyFunctionBody)theEObject;
        T result = caseEmptyFunctionBody(emptyFunctionBody);
        if (result == null) result = caseFunctionBodyPure(emptyFunctionBody);
        if (result == null) result = caseFunctionBodyEffectFull(emptyFunctionBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_PURE:
      {
        CompositionFunctionBodyPure compositionFunctionBodyPure = (CompositionFunctionBodyPure)theEObject;
        T result = caseCompositionFunctionBodyPure(compositionFunctionBodyPure);
        if (result == null) result = caseFunctionBodyPure(compositionFunctionBodyPure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_PURE_FACTOR:
      {
        CompositionFunctionBodyPureFactor compositionFunctionBodyPureFactor = (CompositionFunctionBodyPureFactor)theEObject;
        T result = caseCompositionFunctionBodyPureFactor(compositionFunctionBodyPureFactor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT:
      {
        CompositionFunctionBodyEffect compositionFunctionBodyEffect = (CompositionFunctionBodyEffect)theEObject;
        T result = caseCompositionFunctionBodyEffect(compositionFunctionBodyEffect);
        if (result == null) result = caseFunctionBodyEffectFull(compositionFunctionBodyEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT_FULL_FACTOR:
      {
        CompositionFunctionBodyEffectFullFactor compositionFunctionBodyEffectFullFactor = (CompositionFunctionBodyEffectFullFactor)theEObject;
        T result = caseCompositionFunctionBodyEffectFullFactor(compositionFunctionBodyEffectFullFactor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.IO_TYPE:
      {
        IOType ioType = (IOType)theEObject;
        T result = caseIOType(ioType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.VALUE_TYPE:
      {
        ValueType valueType = (ValueType)theEObject;
        T result = caseValueType(valueType);
        if (result == null) result = caseAdtType(valueType);
        if (result == null) result = caseType(valueType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.INTEGER_TYPE:
      {
        IntegerType integerType = (IntegerType)theEObject;
        T result = caseIntegerType(integerType);
        if (result == null) result = caseValueType(integerType);
        if (result == null) result = caseExpression(integerType);
        if (result == null) result = caseAdtValue(integerType);
        if (result == null) result = caseAdtType(integerType);
        if (result == null) result = caseType(integerType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.STRING_TYPE:
      {
        StringType stringType = (StringType)theEObject;
        T result = caseStringType(stringType);
        if (result == null) result = caseValueType(stringType);
        if (result == null) result = caseExpression(stringType);
        if (result == null) result = caseAdtValue(stringType);
        if (result == null) result = caseAdtType(stringType);
        if (result == null) result = caseType(stringType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.UNIT_TYPE:
      {
        UnitType unitType = (UnitType)theEObject;
        T result = caseUnitType(unitType);
        if (result == null) result = caseType(unitType);
        if (result == null) result = caseExpression(unitType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = caseValueType(dataType);
        if (result == null) result = caseExpression(dataType);
        if (result == null) result = caseAdtValue(dataType);
        if (result == null) result = caseAdtType(dataType);
        if (result == null) result = caseType(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.ADT_VALUE:
      {
        AdtValue adtValue = (AdtValue)theEObject;
        T result = caseAdtValue(adtValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.PROD_VALUE:
      {
        ProdValue prodValue = (ProdValue)theEObject;
        T result = caseProdValue(prodValue);
        if (result == null) result = caseAdtValue(prodValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.SUM_VALUE:
      {
        SumValue sumValue = (SumValue)theEObject;
        T result = caseSumValue(sumValue);
        if (result == null) result = caseAdtValue(sumValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.INT_TO_STRING:
      {
        IntToString intToString = (IntToString)theEObject;
        T result = caseIntToString(intToString);
        if (result == null) result = casePureFunctionDefinition(intToString);
        if (result == null) result = caseInitialPureChainElement(intToString);
        if (result == null) result = caseFunction(intToString);
        if (result == null) result = caseChainElement(intToString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.PRIMITIVE_PRINT:
      {
        PrimitivePrint primitivePrint = (PrimitivePrint)theEObject;
        T result = casePrimitivePrint(primitivePrint);
        if (result == null) result = caseEffectFullFunctionDefinition(primitivePrint);
        if (result == null) result = caseFunction(primitivePrint);
        if (result == null) result = caseChainElement(primitivePrint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FPMLPackage.DATA_VALUE:
      {
        DataValue dataValue = (DataValue)theEObject;
        T result = caseDataValue(dataValue);
        if (result == null) result = caseDataType(dataValue);
        if (result == null) result = caseValueType(dataValue);
        if (result == null) result = caseExpression(dataValue);
        if (result == null) result = caseAdtValue(dataValue);
        if (result == null) result = caseAdtType(dataValue);
        if (result == null) result = caseType(dataValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pure Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pure Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePureBlock(PureBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pure Function Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pure Function Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePureFunctionBlock(PureFunctionBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataBlock(DataBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueBlock(ValueBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect Full Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect Full Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffectFullBlock(EffectFullBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseData(Data object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adt Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adt Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdtType(AdtType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSumType(SumType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prod Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prod Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProdType(ProdType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pure Function Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pure Function Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePureFunctionDefinition(PureFunctionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect Full Function Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect Full Function Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffectFullFunctionDefinition(EffectFullFunctionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main Func</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main Func</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMainFunc(MainFunc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chain Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chain Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChainElement(ChainElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initial Pure Chain Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initial Pure Chain Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialPureChainElement(InitialPureChainElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect Full Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect Full Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffectFullArgument(EffectFullArgument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgument(Argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Body Pure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Body Pure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionBodyPure(FunctionBodyPure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Body Effect Full</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Body Effect Full</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionBodyEffectFull(FunctionBodyEffectFull object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Function Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Function Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptyFunctionBody(EmptyFunctionBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Function Body Pure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Function Body Pure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionFunctionBodyPure(CompositionFunctionBodyPure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Function Body Pure Factor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Function Body Pure Factor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionFunctionBodyPureFactor(CompositionFunctionBodyPureFactor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Function Body Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Function Body Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionFunctionBodyEffect(CompositionFunctionBodyEffect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Function Body Effect Full Factor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Function Body Effect Full Factor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionFunctionBodyEffectFullFactor(CompositionFunctionBodyEffectFullFactor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IO Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IO Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIOType(IOType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueType(ValueType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerType(IntegerType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringType(StringType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitType(UnitType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adt Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adt Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdtValue(AdtValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prod Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prod Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProdValue(ProdValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSumValue(SumValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int To String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int To String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntToString(IntToString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Print</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Print</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitivePrint(PrimitivePrint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataValue(DataValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FPMLSwitch
