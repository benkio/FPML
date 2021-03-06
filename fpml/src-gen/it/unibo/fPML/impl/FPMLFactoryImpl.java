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
      case FPMLPackage.EFFECT_FULL_DATA: return createEffectFullData();
      case FPMLPackage.EFFECT_FULL_FUNCTION_DEFINITION: return createEffectFullFunctionDefinition();
      case FPMLPackage.MAIN_FUNC: return createMainFunc();
      case FPMLPackage.ADDITIONAL_PURE_ARGUMENT: return createAdditionalPureArgument();
      case FPMLPackage.ADDITIONAL_EFFECT_FULL_ARGUMENT: return createAdditionalEffectFullArgument();
      case FPMLPackage.FUNCTION: return createFunction();
      case FPMLPackage.PURE_FUNCTION: return createPureFunction();
      case FPMLPackage.EFFECT_FULL_FUNCTION: return createEffectFullFunction();
      case FPMLPackage.PRIMITIVE_FUNCTION: return createPrimitiveFunction();
      case FPMLPackage.EFFECT_FULL_PRIMITIVE: return createEffectFullPrimitive();
      case FPMLPackage.EFFECT_FULL_BODY_CONTENT: return createEffectFullBodyContent();
      case FPMLPackage.ARGUMENT: return createArgument();
      case FPMLPackage.EFFECT_FULL_ARGUMENT: return createEffectFullArgument();
      case FPMLPackage.PURE_ARGUMENT: return createPureArgument();
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
      case FPMLPackage.EFFECT_FULL_TYPE: return createEffectFullType();
      case FPMLPackage.VOID_TYPE: return createVoidType();
      case FPMLPackage.INTEGER_TYPE: return createIntegerType();
      case FPMLPackage.STRING_TYPE: return createStringType();
      case FPMLPackage.BOOLEAN_TYPE: return createBooleanType();
      case FPMLPackage.UNIT_TYPE: return createUnitType();
      case FPMLPackage.DATA_TYPE: return createDataType();
      case FPMLPackage.EFFECT_FULL_DATA_TYPE: return createEffectFullDataType();
      case FPMLPackage.PURE_FUNCTION_TYPE: return createPureFunctionType();
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE: return createEffectFullFunctionType();
      case FPMLPackage.PURE_ALGEBRAIC_TYPE: return createPureAlgebraicType();
      case FPMLPackage.PURE_SUM_TYPE_FACTOR: return createPureSumTypeFactor();
      case FPMLPackage.PURE_PROD_TYPE_FACTOR: return createPureProdTypeFactor();
      case FPMLPackage.EFFECT_FULL_ALGEBRAIC_TYPE: return createEffectFullAlgebraicType();
      case FPMLPackage.EFFECT_FULL_SUM_TYPE_FACTOR: return createEffectFullSumTypeFactor();
      case FPMLPackage.EFFECT_FULL_PROD_TYPE_FACTOR: return createEffectFullProdTypeFactor();
      case FPMLPackage.EFFECT_FULL_EXPRESSION: return createEffectFullExpression();
      case FPMLPackage.EFFECT_FULL_VALUE_REF: return createEffectFullValueRef();
      case FPMLPackage.EXPRESSION: return createExpression();
      case FPMLPackage.PURE_VALUE_REF: return createPureValueRef();
      case FPMLPackage.PURE_EXPRESSION_AND_PURE_FUNCTION_REFERENCE: return createPureExpressionAndPureFunctionReference();
      case FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE: return createEffectFullExpressionAndEffectFullFunctionReference();
      case FPMLPackage.PRIMITIVE_PURE_FUNCTION: return createPrimitivePureFunction();
      case FPMLPackage.INT_TO_STRING: return createIntToString();
      case FPMLPackage.BOOL_TO_STRING: return createBoolToString();
      case FPMLPackage.INT_POW: return createIntPow();
      case FPMLPackage.PLUS: return createPlus();
      case FPMLPackage.MINUS: return createMinus();
      case FPMLPackage.TIMES: return createTimes();
      case FPMLPackage.MOD: return createMod();
      case FPMLPackage.LEFT_ALGEBRAIC: return createLeftAlgebraic();
      case FPMLPackage.RIGHT_ALGEBRAIC: return createRightAlgebraic();
      case FPMLPackage.APPLY_F: return createApplyF();
      case FPMLPackage.APPLY_FFACTOR: return createApplyFFactor();
      case FPMLPackage.EQUALS: return createEquals();
      case FPMLPackage.MINOR_EQUALS: return createMinorEquals();
      case FPMLPackage.MAJOR_EQUALS: return createMajorEquals();
      case FPMLPackage.MINOR: return createMinor();
      case FPMLPackage.MAJOR: return createMajor();
      case FPMLPackage.LOGIC_AND: return createLogicAnd();
      case FPMLPackage.LOGIC_OR: return createLogicOr();
      case FPMLPackage.LOGIC_NOT: return createLogicNot();
      case FPMLPackage.EXTRACT_PURE: return createExtractPure();
      case FPMLPackage.IS_LEFT_PURE: return createIsLeftPure();
      case FPMLPackage.IS_RIGHT_PURE: return createIsRightPure();
      case FPMLPackage.PURE_IF: return createPureIf();
      case FPMLPackage.PURE_IF_BODY: return createPureIfBody();
      case FPMLPackage.PURE_EITHER_IF: return createPureEitherIf();
      case FPMLPackage.PURE_RETURN: return createPureReturn();
      case FPMLPackage.PRIMITIVE_EFFECT_FULL_FUNCTION: return createPrimitiveEffectFullFunction();
      case FPMLPackage.PRINT: return createPrint();
      case FPMLPackage.LEFT_ALGEBRAIC_IO: return createLeftAlgebraicIO();
      case FPMLPackage.RIGHT_ALGEBRAIC_IO: return createRightAlgebraicIO();
      case FPMLPackage.PRIMITIVE_EFFECT_FULL_VALUE: return createPrimitiveEffectFullValue();
      case FPMLPackage.RANDOM: return createRandom();
      case FPMLPackage.EFFECT_FULL_RETURN: return createEffectFullReturn();
      case FPMLPackage.TIME: return createTime();
      case FPMLPackage.APPLY_FIO: return createApplyFIO();
      case FPMLPackage.APPLY_FIO_FACTOR: return createApplyFIOFactor();
      case FPMLPackage.EXTRACT_EFFECT_FULL: return createExtractEffectFull();
      case FPMLPackage.LIFT_PURE_FUNCTION: return createLiftPureFunction();
      case FPMLPackage.LIFT_EFFECT_FULL_FUNCTION: return createLiftEffectFullFunction();
      case FPMLPackage.IS_LEFT_EFFECT_FULL: return createIsLeftEffectFull();
      case FPMLPackage.IS_RIGHT_EFFECT_FULL: return createIsRightEffectFull();
      case FPMLPackage.EFFECT_FULL_IF: return createEffectFullIf();
      case FPMLPackage.EFFECT_FULL_EITHER_IF: return createEffectFullEitherIf();
      case FPMLPackage.EFFECT_FULL_IF_BODY: return createEffectFullIfBody();
      case FPMLPackage.GET_LINE_STD_IN: return createGetLineStdIn();
      case FPMLPackage.GET_INT_SDT_IN: return createGetIntSdtIn();
      case FPMLPackage.PURE_VALUE: return createPureValue();
      case FPMLPackage.EFFECT_FULL_VALUE: return createEffectFullValue();
      case FPMLPackage.IO_EFFECT_FULL_EXPRESSION: return createIOEffectFullExpression();
      case FPMLPackage.IO_EXPRESSION: return createIOExpression();
      case FPMLPackage.IO_PURE_FUNCTION: return createIOPureFunction();
      case FPMLPackage.IO_EFFECT_FULL_FUNCTION: return createIOEffectFullFunction();
      case FPMLPackage.EFFECT_FULL_LAMBDA: return createEffectFullLambda();
      case FPMLPackage.DATA_VALUE: return createDataValue();
      case FPMLPackage.EFFECT_FULL_DATA_VALUE: return createEffectFullDataValue();
      case FPMLPackage.PURE_LAMBDA: return createPureLambda();
      case FPMLPackage.PURE_PROD_VALUE: return createPureProdValue();
      case FPMLPackage.PURE_SUM_VALUE: return createPureSumValue();
      case FPMLPackage.EFFECT_FULL_PROD_VALUE: return createEffectFullProdValue();
      case FPMLPackage.EFFECT_FULL_SUM_VALUE: return createEffectFullSumValue();
      case FPMLPackage.GET_INT_STD_IN: return createGetIntStdIn();
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
  public EffectFullPrimitive createEffectFullPrimitive()
  {
    EffectFullPrimitiveImpl effectFullPrimitive = new EffectFullPrimitiveImpl();
    return effectFullPrimitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullBodyContent createEffectFullBodyContent()
  {
    EffectFullBodyContentImpl effectFullBodyContent = new EffectFullBodyContentImpl();
    return effectFullBodyContent;
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
  public PureArgument createPureArgument()
  {
    PureArgumentImpl pureArgument = new PureArgumentImpl();
    return pureArgument;
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
  public EffectFullType createEffectFullType()
  {
    EffectFullTypeImpl effectFullType = new EffectFullTypeImpl();
    return effectFullType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VoidType createVoidType()
  {
    VoidTypeImpl voidType = new VoidTypeImpl();
    return voidType;
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
  public BooleanType createBooleanType()
  {
    BooleanTypeImpl booleanType = new BooleanTypeImpl();
    return booleanType;
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
  public PureAlgebraicType createPureAlgebraicType()
  {
    PureAlgebraicTypeImpl pureAlgebraicType = new PureAlgebraicTypeImpl();
    return pureAlgebraicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureSumTypeFactor createPureSumTypeFactor()
  {
    PureSumTypeFactorImpl pureSumTypeFactor = new PureSumTypeFactorImpl();
    return pureSumTypeFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureProdTypeFactor createPureProdTypeFactor()
  {
    PureProdTypeFactorImpl pureProdTypeFactor = new PureProdTypeFactorImpl();
    return pureProdTypeFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullAlgebraicType createEffectFullAlgebraicType()
  {
    EffectFullAlgebraicTypeImpl effectFullAlgebraicType = new EffectFullAlgebraicTypeImpl();
    return effectFullAlgebraicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullSumTypeFactor createEffectFullSumTypeFactor()
  {
    EffectFullSumTypeFactorImpl effectFullSumTypeFactor = new EffectFullSumTypeFactorImpl();
    return effectFullSumTypeFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullProdTypeFactor createEffectFullProdTypeFactor()
  {
    EffectFullProdTypeFactorImpl effectFullProdTypeFactor = new EffectFullProdTypeFactorImpl();
    return effectFullProdTypeFactor;
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
  public PureExpressionAndPureFunctionReference createPureExpressionAndPureFunctionReference()
  {
    PureExpressionAndPureFunctionReferenceImpl pureExpressionAndPureFunctionReference = new PureExpressionAndPureFunctionReferenceImpl();
    return pureExpressionAndPureFunctionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullExpressionAndEffectFullFunctionReference createEffectFullExpressionAndEffectFullFunctionReference()
  {
    EffectFullExpressionAndEffectFullFunctionReferenceImpl effectFullExpressionAndEffectFullFunctionReference = new EffectFullExpressionAndEffectFullFunctionReferenceImpl();
    return effectFullExpressionAndEffectFullFunctionReference;
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
  public BoolToString createBoolToString()
  {
    BoolToStringImpl boolToString = new BoolToStringImpl();
    return boolToString;
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
  public LeftAlgebraic createLeftAlgebraic()
  {
    LeftAlgebraicImpl leftAlgebraic = new LeftAlgebraicImpl();
    return leftAlgebraic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightAlgebraic createRightAlgebraic()
  {
    RightAlgebraicImpl rightAlgebraic = new RightAlgebraicImpl();
    return rightAlgebraic;
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
  public ApplyFFactor createApplyFFactor()
  {
    ApplyFFactorImpl applyFFactor = new ApplyFFactorImpl();
    return applyFFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equals createEquals()
  {
    EqualsImpl equals = new EqualsImpl();
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinorEquals createMinorEquals()
  {
    MinorEqualsImpl minorEquals = new MinorEqualsImpl();
    return minorEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MajorEquals createMajorEquals()
  {
    MajorEqualsImpl majorEquals = new MajorEqualsImpl();
    return majorEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minor createMinor()
  {
    MinorImpl minor = new MinorImpl();
    return minor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Major createMajor()
  {
    MajorImpl major = new MajorImpl();
    return major;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicAnd createLogicAnd()
  {
    LogicAndImpl logicAnd = new LogicAndImpl();
    return logicAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicOr createLogicOr()
  {
    LogicOrImpl logicOr = new LogicOrImpl();
    return logicOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicNot createLogicNot()
  {
    LogicNotImpl logicNot = new LogicNotImpl();
    return logicNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtractPure createExtractPure()
  {
    ExtractPureImpl extractPure = new ExtractPureImpl();
    return extractPure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsLeftPure createIsLeftPure()
  {
    IsLeftPureImpl isLeftPure = new IsLeftPureImpl();
    return isLeftPure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsRightPure createIsRightPure()
  {
    IsRightPureImpl isRightPure = new IsRightPureImpl();
    return isRightPure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureIf createPureIf()
  {
    PureIfImpl pureIf = new PureIfImpl();
    return pureIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureIfBody createPureIfBody()
  {
    PureIfBodyImpl pureIfBody = new PureIfBodyImpl();
    return pureIfBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureEitherIf createPureEitherIf()
  {
    PureEitherIfImpl pureEitherIf = new PureEitherIfImpl();
    return pureEitherIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureReturn createPureReturn()
  {
    PureReturnImpl pureReturn = new PureReturnImpl();
    return pureReturn;
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
  public Print createPrint()
  {
    PrintImpl print = new PrintImpl();
    return print;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftAlgebraicIO createLeftAlgebraicIO()
  {
    LeftAlgebraicIOImpl leftAlgebraicIO = new LeftAlgebraicIOImpl();
    return leftAlgebraicIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightAlgebraicIO createRightAlgebraicIO()
  {
    RightAlgebraicIOImpl rightAlgebraicIO = new RightAlgebraicIOImpl();
    return rightAlgebraicIO;
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
  public Random createRandom()
  {
    RandomImpl random = new RandomImpl();
    return random;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullReturn createEffectFullReturn()
  {
    EffectFullReturnImpl effectFullReturn = new EffectFullReturnImpl();
    return effectFullReturn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time createTime()
  {
    TimeImpl time = new TimeImpl();
    return time;
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
  public ExtractEffectFull createExtractEffectFull()
  {
    ExtractEffectFullImpl extractEffectFull = new ExtractEffectFullImpl();
    return extractEffectFull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiftPureFunction createLiftPureFunction()
  {
    LiftPureFunctionImpl liftPureFunction = new LiftPureFunctionImpl();
    return liftPureFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiftEffectFullFunction createLiftEffectFullFunction()
  {
    LiftEffectFullFunctionImpl liftEffectFullFunction = new LiftEffectFullFunctionImpl();
    return liftEffectFullFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsLeftEffectFull createIsLeftEffectFull()
  {
    IsLeftEffectFullImpl isLeftEffectFull = new IsLeftEffectFullImpl();
    return isLeftEffectFull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsRightEffectFull createIsRightEffectFull()
  {
    IsRightEffectFullImpl isRightEffectFull = new IsRightEffectFullImpl();
    return isRightEffectFull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullIf createEffectFullIf()
  {
    EffectFullIfImpl effectFullIf = new EffectFullIfImpl();
    return effectFullIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullEitherIf createEffectFullEitherIf()
  {
    EffectFullEitherIfImpl effectFullEitherIf = new EffectFullEitherIfImpl();
    return effectFullEitherIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullIfBody createEffectFullIfBody()
  {
    EffectFullIfBodyImpl effectFullIfBody = new EffectFullIfBodyImpl();
    return effectFullIfBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetLineStdIn createGetLineStdIn()
  {
    GetLineStdInImpl getLineStdIn = new GetLineStdInImpl();
    return getLineStdIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetIntSdtIn createGetIntSdtIn()
  {
    GetIntSdtInImpl getIntSdtIn = new GetIntSdtInImpl();
    return getIntSdtIn;
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
  public IOEffectFullExpression createIOEffectFullExpression()
  {
    IOEffectFullExpressionImpl ioEffectFullExpression = new IOEffectFullExpressionImpl();
    return ioEffectFullExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IOExpression createIOExpression()
  {
    IOExpressionImpl ioExpression = new IOExpressionImpl();
    return ioExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IOPureFunction createIOPureFunction()
  {
    IOPureFunctionImpl ioPureFunction = new IOPureFunctionImpl();
    return ioPureFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IOEffectFullFunction createIOEffectFullFunction()
  {
    IOEffectFullFunctionImpl ioEffectFullFunction = new IOEffectFullFunctionImpl();
    return ioEffectFullFunction;
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
  public GetIntStdIn createGetIntStdIn()
  {
    GetIntStdInImpl getIntStdIn = new GetIntStdInImpl();
    return getIntStdIn;
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
