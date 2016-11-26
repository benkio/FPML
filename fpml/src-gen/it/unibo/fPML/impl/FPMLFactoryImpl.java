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
      case FPMLPackage.PURE_DATA_BLOCK: return createPureDataBlock();
      case FPMLPackage.PURE_VALUE_BLOCK: return createPureValueBlock();
      case FPMLPackage.EFFECT_FULL_BLOCK: return createEffectFullBlock();
      case FPMLPackage.EFFECT_FULL_DATA_BLOCK: return createEffectFullDataBlock();
      case FPMLPackage.EFFECT_FULL_VALUE_BLOCK: return createEffectFullValueBlock();
      case FPMLPackage.EFFECT_FULL_FUNCTION_BLOCK: return createEffectFullFunctionBlock();
      case FPMLPackage.PURE_DATA: return createPureData();
      case FPMLPackage.PURE_FUNCTION_DEFINITION: return createPureFunctionDefinition();
      case FPMLPackage.PURE_ADT_TYPE: return createPureAdtType();
      case FPMLPackage.PURE_SUM_TYPE: return createPureSumType();
      case FPMLPackage.PURE_PROD_TYPE: return createPureProdType();
      case FPMLPackage.EFFECT_FULL_DATA: return createEffectFullData();
      case FPMLPackage.EFFECT_FULL_FUNCTION_DEFINITION: return createEffectFullFunctionDefinition();
      case FPMLPackage.EFFECT_FULL_ADT_TYPE: return createEffectFullAdtType();
      case FPMLPackage.EFFECT_FULL_SUM_TYPE: return createEffectFullSumType();
      case FPMLPackage.EFFECT_FULL_PROD_TYPE: return createEffectFullProdType();
      case FPMLPackage.MAIN_FUNC: return createMainFunc();
      case FPMLPackage.ADDITIONAL_PURE_ARGUMENT: return createAdditionalPureArgument();
      case FPMLPackage.ADDITIONAL_EFFECT_FULL_ARGUMENT: return createAdditionalEffectFullArgument();
      case FPMLPackage.FUNCTION: return createFunction();
      case FPMLPackage.PURE_FUNCTION: return createPureFunction();
      case FPMLPackage.EFFECT_FULL_FUNCTION: return createEffectFullFunction();
      case FPMLPackage.EFFECT_FULL_REFERENCE: return createEffectFullReference();
      case FPMLPackage.PURE_REFERENCE: return createPureReference();
      case FPMLPackage.PRIMITIVE_FUNCTION: return createPrimitiveFunction();
      case FPMLPackage.EFFECT_FULL_ARGUMENT: return createEffectFullArgument();
      case FPMLPackage.ARGUMENT: return createArgument();
      case FPMLPackage.FUNCTION_BODY_PURE: return createFunctionBodyPure();
      case FPMLPackage.FUNCTION_BODY_EFFECT_FULL: return createFunctionBodyEffectFull();
      case FPMLPackage.EMPTY_FUNCTION_BODY: return createEmptyFunctionBody();
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_PURE: return createCompositionFunctionBodyPure();
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_PURE_FACTOR: return createCompositionFunctionBodyPureFactor();
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT: return createCompositionFunctionBodyEffect();
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT_FULL_FACTOR: return createCompositionFunctionBodyEffectFullFactor();
      case FPMLPackage.IO_TYPE: return createIOType();
      case FPMLPackage.VALUE_TYPE: return createValueType();
      case FPMLPackage.TYPE: return createType();
      case FPMLPackage.INTEGER_TYPE: return createIntegerType();
      case FPMLPackage.STRING_TYPE: return createStringType();
      case FPMLPackage.UNIT_TYPE: return createUnitType();
      case FPMLPackage.DATA_TYPE: return createDataType();
      case FPMLPackage.EFFECT_FULL_DATA_TYPE: return createEffectFullDataType();
      case FPMLPackage.PURE_FUNCTION_TYPE: return createPureFunctionType();
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE: return createEffectFullFunctionType();
      case FPMLPackage.EFFECT_FULL_EXPRESSION: return createEffectFullExpression();
      case FPMLPackage.EFFECT_FULL_VALUE_REF: return createEffectFullValueRef();
      case FPMLPackage.EXPRESSION: return createExpression();
      case FPMLPackage.PURE_VALUE_REF: return createPureValueRef();
      case FPMLPackage.PURE_ADT_VALUE: return createPureAdtValue();
      case FPMLPackage.PURE_PROD_VALUE: return createPureProdValue();
      case FPMLPackage.PURE_SUM_VALUE: return createPureSumValue();
      case FPMLPackage.EFFECT_FULL_ADT_VALUE: return createEffectFullAdtValue();
      case FPMLPackage.EFFECT_FULL_PROD_VALUE: return createEffectFullProdValue();
      case FPMLPackage.EFFECT_FULL_SUM_VALUE: return createEffectFullSumValue();
      case FPMLPackage.PRIMITIVE_PURE_FUNCTION: return createPrimitivePureFunction();
      case FPMLPackage.INT_TO_STRING: return createIntToString();
      case FPMLPackage.INT_POW: return createIntPow();
      case FPMLPackage.PLUS: return createPlus();
      case FPMLPackage.MINUS: return createMinus();
      case FPMLPackage.TIMES: return createTimes();
      case FPMLPackage.MOD: return createMod();
      case FPMLPackage.APPLY_F: return createApplyF();
      case FPMLPackage.PRIMITIVE_EFFECT_FULL_FUNCTION: return createPrimitiveEffectFullFunction();
      case FPMLPackage.PRIMITIVE_PRINT: return createPrimitivePrint();
      case FPMLPackage.PRIMITIVE_EFFECT_FULL_VALUE: return createPrimitiveEffectFullValue();
      case FPMLPackage.PRIMITIVE_RANDOM: return createPrimitiveRandom();
      case FPMLPackage.APPLY_FIO: return createApplyFIO();
      case FPMLPackage.APPLY_FIO_FACTOR: return createApplyFIOFactor();
      case FPMLPackage.PURE_VALUE: return createPureValue();
      case FPMLPackage.EFFECT_FULL_VALUE: return createEffectFullValue();
      case FPMLPackage.EFFECT_FULL_LAMBDA: return createEffectFullLambda();
      case FPMLPackage.DATA_VALUE: return createDataValue();
      case FPMLPackage.EFFECT_FULL_DATA_VALUE: return createEffectFullDataValue();
      case FPMLPackage.PURE_LAMBDA: return createPureLambda();
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
  public PureDataBlock createPureDataBlock()
  {
    PureDataBlockImpl pureDataBlock = new PureDataBlockImpl();
    return pureDataBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureValueBlock createPureValueBlock()
  {
    PureValueBlockImpl pureValueBlock = new PureValueBlockImpl();
    return pureValueBlock;
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
  public EffectFullDataBlock createEffectFullDataBlock()
  {
    EffectFullDataBlockImpl effectFullDataBlock = new EffectFullDataBlockImpl();
    return effectFullDataBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullValueBlock createEffectFullValueBlock()
  {
    EffectFullValueBlockImpl effectFullValueBlock = new EffectFullValueBlockImpl();
    return effectFullValueBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullFunctionBlock createEffectFullFunctionBlock()
  {
    EffectFullFunctionBlockImpl effectFullFunctionBlock = new EffectFullFunctionBlockImpl();
    return effectFullFunctionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureData createPureData()
  {
    PureDataImpl pureData = new PureDataImpl();
    return pureData;
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
  public PureAdtType createPureAdtType()
  {
    PureAdtTypeImpl pureAdtType = new PureAdtTypeImpl();
    return pureAdtType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureSumType createPureSumType()
  {
    PureSumTypeImpl pureSumType = new PureSumTypeImpl();
    return pureSumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureProdType createPureProdType()
  {
    PureProdTypeImpl pureProdType = new PureProdTypeImpl();
    return pureProdType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullData createEffectFullData()
  {
    EffectFullDataImpl effectFullData = new EffectFullDataImpl();
    return effectFullData;
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
  public EffectFullAdtType createEffectFullAdtType()
  {
    EffectFullAdtTypeImpl effectFullAdtType = new EffectFullAdtTypeImpl();
    return effectFullAdtType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullSumType createEffectFullSumType()
  {
    EffectFullSumTypeImpl effectFullSumType = new EffectFullSumTypeImpl();
    return effectFullSumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullProdType createEffectFullProdType()
  {
    EffectFullProdTypeImpl effectFullProdType = new EffectFullProdTypeImpl();
    return effectFullProdType;
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
  public AdditionalPureArgument createAdditionalPureArgument()
  {
    AdditionalPureArgumentImpl additionalPureArgument = new AdditionalPureArgumentImpl();
    return additionalPureArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditionalEffectFullArgument createAdditionalEffectFullArgument()
  {
    AdditionalEffectFullArgumentImpl additionalEffectFullArgument = new AdditionalEffectFullArgumentImpl();
    return additionalEffectFullArgument;
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
  public PureFunction createPureFunction()
  {
    PureFunctionImpl pureFunction = new PureFunctionImpl();
    return pureFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullFunction createEffectFullFunction()
  {
    EffectFullFunctionImpl effectFullFunction = new EffectFullFunctionImpl();
    return effectFullFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullReference createEffectFullReference()
  {
    EffectFullReferenceImpl effectFullReference = new EffectFullReferenceImpl();
    return effectFullReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureReference createPureReference()
  {
    PureReferenceImpl pureReference = new PureReferenceImpl();
    return pureReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveFunction createPrimitiveFunction()
  {
    PrimitiveFunctionImpl primitiveFunction = new PrimitiveFunctionImpl();
    return primitiveFunction;
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
  public EffectFullDataType createEffectFullDataType()
  {
    EffectFullDataTypeImpl effectFullDataType = new EffectFullDataTypeImpl();
    return effectFullDataType;
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
  public EffectFullExpression createEffectFullExpression()
  {
    EffectFullExpressionImpl effectFullExpression = new EffectFullExpressionImpl();
    return effectFullExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullValueRef createEffectFullValueRef()
  {
    EffectFullValueRefImpl effectFullValueRef = new EffectFullValueRefImpl();
    return effectFullValueRef;
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
  public PureValueRef createPureValueRef()
  {
    PureValueRefImpl pureValueRef = new PureValueRefImpl();
    return pureValueRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureAdtValue createPureAdtValue()
  {
    PureAdtValueImpl pureAdtValue = new PureAdtValueImpl();
    return pureAdtValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureProdValue createPureProdValue()
  {
    PureProdValueImpl pureProdValue = new PureProdValueImpl();
    return pureProdValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureSumValue createPureSumValue()
  {
    PureSumValueImpl pureSumValue = new PureSumValueImpl();
    return pureSumValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullAdtValue createEffectFullAdtValue()
  {
    EffectFullAdtValueImpl effectFullAdtValue = new EffectFullAdtValueImpl();
    return effectFullAdtValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullProdValue createEffectFullProdValue()
  {
    EffectFullProdValueImpl effectFullProdValue = new EffectFullProdValueImpl();
    return effectFullProdValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullSumValue createEffectFullSumValue()
  {
    EffectFullSumValueImpl effectFullSumValue = new EffectFullSumValueImpl();
    return effectFullSumValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitivePureFunction createPrimitivePureFunction()
  {
    PrimitivePureFunctionImpl primitivePureFunction = new PrimitivePureFunctionImpl();
    return primitivePureFunction;
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
  public IntPow createIntPow()
  {
    IntPowImpl intPow = new IntPowImpl();
    return intPow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Times createTimes()
  {
    TimesImpl times = new TimesImpl();
    return times;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mod createMod()
  {
    ModImpl mod = new ModImpl();
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyF createApplyF()
  {
    ApplyFImpl applyF = new ApplyFImpl();
    return applyF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveEffectFullFunction createPrimitiveEffectFullFunction()
  {
    PrimitiveEffectFullFunctionImpl primitiveEffectFullFunction = new PrimitiveEffectFullFunctionImpl();
    return primitiveEffectFullFunction;
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
  public PrimitiveEffectFullValue createPrimitiveEffectFullValue()
  {
    PrimitiveEffectFullValueImpl primitiveEffectFullValue = new PrimitiveEffectFullValueImpl();
    return primitiveEffectFullValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveRandom createPrimitiveRandom()
  {
    PrimitiveRandomImpl primitiveRandom = new PrimitiveRandomImpl();
    return primitiveRandom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyFIO createApplyFIO()
  {
    ApplyFIOImpl applyFIO = new ApplyFIOImpl();
    return applyFIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyFIOFactor createApplyFIOFactor()
  {
    ApplyFIOFactorImpl applyFIOFactor = new ApplyFIOFactorImpl();
    return applyFIOFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureValue createPureValue()
  {
    PureValueImpl pureValue = new PureValueImpl();
    return pureValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullValue createEffectFullValue()
  {
    EffectFullValueImpl effectFullValue = new EffectFullValueImpl();
    return effectFullValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullLambda createEffectFullLambda()
  {
    EffectFullLambdaImpl effectFullLambda = new EffectFullLambdaImpl();
    return effectFullLambda;
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
  public EffectFullDataValue createEffectFullDataValue()
  {
    EffectFullDataValueImpl effectFullDataValue = new EffectFullDataValueImpl();
    return effectFullDataValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureLambda createPureLambda()
  {
    PureLambdaImpl pureLambda = new PureLambdaImpl();
    return pureLambda;
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
