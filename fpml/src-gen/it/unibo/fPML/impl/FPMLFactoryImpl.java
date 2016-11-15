/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.impl;

import it.unibo.fPML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FPMLFactoryImpl extends EFactoryImpl implements FPMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FPMLFactory init()
  {
    try
    {
      FPMLFactory theFPMLFactory = (FPMLFactory)EPackage.Registry.INSTANCE.getEFactory(FPMLPackage.eNS_URI);
      if (theFPMLFactory != null)
      {
        return theFPMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FPMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FPMLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FPMLPackage.MODEL: return createModel();
      case FPMLPackage.PURE_BLOCK: return createPureBlock();
      case FPMLPackage.PURE_FUNCTION_BLOCK: return createPureFunctionBlock();
      case FPMLPackage.DATA_BLOCK: return createDataBlock();
      case FPMLPackage.VALUE_BLOCK: return createValueBlock();
      case FPMLPackage.EFFECT_FULL_BLOCK: return createEffectFullBlock();
      case FPMLPackage.DATA: return createData();
      case FPMLPackage.VALUE: return createValue();
      case FPMLPackage.ADT_TYPE: return createAdtType();
      case FPMLPackage.SUM_TYPE: return createSumType();
      case FPMLPackage.PROD_TYPE: return createProdType();
      case FPMLPackage.PURE_FUNCTION_DEFINITION: return createPureFunctionDefinition();
      case FPMLPackage.EFFECT_FULL_FUNCTION_DEFINITION: return createEffectFullFunctionDefinition();
      case FPMLPackage.MAIN_FUNC: return createMainFunc();
      case FPMLPackage.CHAIN_ELEMENT: return createChainElement();
      case FPMLPackage.INITIAL_PURE_CHAIN_ELEMENT: return createInitialPureChainElement();
      case FPMLPackage.FUNCTION: return createFunction();
      case FPMLPackage.EFFECT_FULL_ARGUMENT: return createEffectFullArgument();
      case FPMLPackage.ARGUMENT: return createArgument();
      case FPMLPackage.FUNCTION_BODY_PURE: return createFunctionBodyPure();
      case FPMLPackage.FUNCTION_BODY_EFFECT_FULL: return createFunctionBodyEffectFull();
      case FPMLPackage.EMPTY_FUNCTION_BODY: return createEmptyFunctionBody();
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_PURE: return createCompositionFunctionBodyPure();
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_PURE_FACTOR: return createCompositionFunctionBodyPureFactor();
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT: return createCompositionFunctionBodyEffect();
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT_FULL_FACTOR: return createCompositionFunctionBodyEffectFullFactor();
      case FPMLPackage.RETURN_PURE_FUNCTION: return createReturnPureFunction();
      case FPMLPackage.RETURN_EFFECT_FULL_FUNCTION: return createReturnEffectFullFunction();
      case FPMLPackage.IO_TYPE: return createIOType();
      case FPMLPackage.VALUE_TYPE: return createValueType();
      case FPMLPackage.TYPE: return createType();
      case FPMLPackage.INTEGER_TYPE: return createIntegerType();
      case FPMLPackage.STRING_TYPE: return createStringType();
      case FPMLPackage.UNIT_TYPE: return createUnitType();
      case FPMLPackage.DATA_TYPE: return createDataType();
      case FPMLPackage.PURE_FUNCTION_TYPE: return createPureFunctionType();
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE: return createEffectFullFunctionType();
      case FPMLPackage.EXPRESSION: return createExpression();
      case FPMLPackage.FUNCTION_TYPE: return createFunctionType();
      case FPMLPackage.ADT_VALUE: return createAdtValue();
      case FPMLPackage.PROD_VALUE: return createProdValue();
      case FPMLPackage.SUM_VALUE: return createSumValue();
      case FPMLPackage.INT_TO_STRING: return createIntToString();
      case FPMLPackage.PRIMITIVE_PRINT: return createPrimitivePrint();
      case FPMLPackage.DATA_VALUE: return createDataValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureBlock createPureBlock()
  {
    PureBlockImpl pureBlock = new PureBlockImpl();
    return pureBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureFunctionBlock createPureFunctionBlock()
  {
    PureFunctionBlockImpl pureFunctionBlock = new PureFunctionBlockImpl();
    return pureFunctionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataBlock createDataBlock()
  {
    DataBlockImpl dataBlock = new DataBlockImpl();
    return dataBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueBlock createValueBlock()
  {
    ValueBlockImpl valueBlock = new ValueBlockImpl();
    return valueBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullBlock createEffectFullBlock()
  {
    EffectFullBlockImpl effectFullBlock = new EffectFullBlockImpl();
    return effectFullBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data createData()
  {
    DataImpl data = new DataImpl();
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdtType createAdtType()
  {
    AdtTypeImpl adtType = new AdtTypeImpl();
    return adtType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SumType createSumType()
  {
    SumTypeImpl sumType = new SumTypeImpl();
    return sumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProdType createProdType()
  {
    ProdTypeImpl prodType = new ProdTypeImpl();
    return prodType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureFunctionDefinition createPureFunctionDefinition()
  {
    PureFunctionDefinitionImpl pureFunctionDefinition = new PureFunctionDefinitionImpl();
    return pureFunctionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullFunctionDefinition createEffectFullFunctionDefinition()
  {
    EffectFullFunctionDefinitionImpl effectFullFunctionDefinition = new EffectFullFunctionDefinitionImpl();
    return effectFullFunctionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainFunc createMainFunc()
  {
    MainFuncImpl mainFunc = new MainFuncImpl();
    return mainFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChainElement createChainElement()
  {
    ChainElementImpl chainElement = new ChainElementImpl();
    return chainElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialPureChainElement createInitialPureChainElement()
  {
    InitialPureChainElementImpl initialPureChainElement = new InitialPureChainElementImpl();
    return initialPureChainElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullArgument createEffectFullArgument()
  {
    EffectFullArgumentImpl effectFullArgument = new EffectFullArgumentImpl();
    return effectFullArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionBodyPure createFunctionBodyPure()
  {
    FunctionBodyPureImpl functionBodyPure = new FunctionBodyPureImpl();
    return functionBodyPure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionBodyEffectFull createFunctionBodyEffectFull()
  {
    FunctionBodyEffectFullImpl functionBodyEffectFull = new FunctionBodyEffectFullImpl();
    return functionBodyEffectFull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyFunctionBody createEmptyFunctionBody()
  {
    EmptyFunctionBodyImpl emptyFunctionBody = new EmptyFunctionBodyImpl();
    return emptyFunctionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionFunctionBodyPure createCompositionFunctionBodyPure()
  {
    CompositionFunctionBodyPureImpl compositionFunctionBodyPure = new CompositionFunctionBodyPureImpl();
    return compositionFunctionBodyPure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionFunctionBodyPureFactor createCompositionFunctionBodyPureFactor()
  {
    CompositionFunctionBodyPureFactorImpl compositionFunctionBodyPureFactor = new CompositionFunctionBodyPureFactorImpl();
    return compositionFunctionBodyPureFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionFunctionBodyEffect createCompositionFunctionBodyEffect()
  {
    CompositionFunctionBodyEffectImpl compositionFunctionBodyEffect = new CompositionFunctionBodyEffectImpl();
    return compositionFunctionBodyEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionFunctionBodyEffectFullFactor createCompositionFunctionBodyEffectFullFactor()
  {
    CompositionFunctionBodyEffectFullFactorImpl compositionFunctionBodyEffectFullFactor = new CompositionFunctionBodyEffectFullFactorImpl();
    return compositionFunctionBodyEffectFullFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnPureFunction createReturnPureFunction()
  {
    ReturnPureFunctionImpl returnPureFunction = new ReturnPureFunctionImpl();
    return returnPureFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnEffectFullFunction createReturnEffectFullFunction()
  {
    ReturnEffectFullFunctionImpl returnEffectFullFunction = new ReturnEffectFullFunctionImpl();
    return returnEffectFullFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IOType createIOType()
  {
    IOTypeImpl ioType = new IOTypeImpl();
    return ioType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType createValueType()
  {
    ValueTypeImpl valueType = new ValueTypeImpl();
    return valueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerType createIntegerType()
  {
    IntegerTypeImpl integerType = new IntegerTypeImpl();
    return integerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringType createStringType()
  {
    StringTypeImpl stringType = new StringTypeImpl();
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitType createUnitType()
  {
    UnitTypeImpl unitType = new UnitTypeImpl();
    return unitType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureFunctionType createPureFunctionType()
  {
    PureFunctionTypeImpl pureFunctionType = new PureFunctionTypeImpl();
    return pureFunctionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullFunctionType createEffectFullFunctionType()
  {
    EffectFullFunctionTypeImpl effectFullFunctionType = new EffectFullFunctionTypeImpl();
    return effectFullFunctionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionType createFunctionType()
  {
    FunctionTypeImpl functionType = new FunctionTypeImpl();
    return functionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdtValue createAdtValue()
  {
    AdtValueImpl adtValue = new AdtValueImpl();
    return adtValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProdValue createProdValue()
  {
    ProdValueImpl prodValue = new ProdValueImpl();
    return prodValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SumValue createSumValue()
  {
    SumValueImpl sumValue = new SumValueImpl();
    return sumValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntToString createIntToString()
  {
    IntToStringImpl intToString = new IntToStringImpl();
    return intToString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitivePrint createPrimitivePrint()
  {
    PrimitivePrintImpl primitivePrint = new PrimitivePrintImpl();
    return primitivePrint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataValue createDataValue()
  {
    DataValueImpl dataValue = new DataValueImpl();
    return dataValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FPMLPackage getFPMLPackage()
  {
    return (FPMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FPMLPackage getPackage()
  {
    return FPMLPackage.eINSTANCE;
  }

} //FPMLFactoryImpl
