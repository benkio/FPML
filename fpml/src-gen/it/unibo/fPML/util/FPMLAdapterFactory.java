/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.util;

import it.unibo.fPML.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unibo.fPML.FPMLPackage
 * @generated
 */
public class FPMLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FPMLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FPMLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FPMLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FPMLSwitch<Adapter> modelSwitch =
    new FPMLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casePureBlock(PureBlock object)
      {
        return createPureBlockAdapter();
      }
      @Override
      public Adapter casePureFunctionBlock(PureFunctionBlock object)
      {
        return createPureFunctionBlockAdapter();
      }
      @Override
      public Adapter caseDataBlock(DataBlock object)
      {
        return createDataBlockAdapter();
      }
      @Override
      public Adapter caseValueBlock(ValueBlock object)
      {
        return createValueBlockAdapter();
      }
      @Override
      public Adapter caseEffectFullBlock(EffectFullBlock object)
      {
        return createEffectFullBlockAdapter();
      }
      @Override
      public Adapter caseData(Data object)
      {
        return createDataAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseAdtType(AdtType object)
      {
        return createAdtTypeAdapter();
      }
      @Override
      public Adapter caseSumType(SumType object)
      {
        return createSumTypeAdapter();
      }
      @Override
      public Adapter caseProdType(ProdType object)
      {
        return createProdTypeAdapter();
      }
      @Override
      public Adapter casePureFunction(PureFunction object)
      {
        return createPureFunctionAdapter();
      }
      @Override
      public Adapter caseEffectFullFunction(EffectFullFunction object)
      {
        return createEffectFullFunctionAdapter();
      }
      @Override
      public Adapter caseMainFunc(MainFunc object)
      {
        return createMainFuncAdapter();
      }
      @Override
      public Adapter caseChainElement(ChainElement object)
      {
        return createChainElementAdapter();
      }
      @Override
      public Adapter caseInitialPureChainElement(InitialPureChainElement object)
      {
        return createInitialPureChainElementAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseEffectFullArgument(EffectFullArgument object)
      {
        return createEffectFullArgumentAdapter();
      }
      @Override
      public Adapter caseArgument(Argument object)
      {
        return createArgumentAdapter();
      }
      @Override
      public Adapter caseFunctionBodyPure(FunctionBodyPure object)
      {
        return createFunctionBodyPureAdapter();
      }
      @Override
      public Adapter caseFunctionBodyEffectFull(FunctionBodyEffectFull object)
      {
        return createFunctionBodyEffectFullAdapter();
      }
      @Override
      public Adapter caseEmptyFunctionBody(EmptyFunctionBody object)
      {
        return createEmptyFunctionBodyAdapter();
      }
      @Override
      public Adapter caseCompositionFunctionBodyPure(CompositionFunctionBodyPure object)
      {
        return createCompositionFunctionBodyPureAdapter();
      }
      @Override
      public Adapter caseCompositionFunctionBodyEffect(CompositionFunctionBodyEffect object)
      {
        return createCompositionFunctionBodyEffectAdapter();
      }
      @Override
      public Adapter caseIOType(IOType object)
      {
        return createIOTypeAdapter();
      }
      @Override
      public Adapter caseValueType(ValueType object)
      {
        return createValueTypeAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseIntegerType(IntegerType object)
      {
        return createIntegerTypeAdapter();
      }
      @Override
      public Adapter caseStringType(StringType object)
      {
        return createStringTypeAdapter();
      }
      @Override
      public Adapter caseUnitType(UnitType object)
      {
        return createUnitTypeAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseAdtValue(AdtValue object)
      {
        return createAdtValueAdapter();
      }
      @Override
      public Adapter caseProdValue(ProdValue object)
      {
        return createProdValueAdapter();
      }
      @Override
      public Adapter caseSumValue(SumValue object)
      {
        return createSumValueAdapter();
      }
      @Override
      public Adapter caseDataValue(DataValue object)
      {
        return createDataValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.PureBlock <em>Pure Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.PureBlock
   * @generated
   */
  public Adapter createPureBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.PureFunctionBlock <em>Pure Function Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.PureFunctionBlock
   * @generated
   */
  public Adapter createPureFunctionBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.DataBlock <em>Data Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.DataBlock
   * @generated
   */
  public Adapter createDataBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.ValueBlock <em>Value Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.ValueBlock
   * @generated
   */
  public Adapter createValueBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.EffectFullBlock <em>Effect Full Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.EffectFullBlock
   * @generated
   */
  public Adapter createEffectFullBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.Data <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.Data
   * @generated
   */
  public Adapter createDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.AdtType <em>Adt Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.AdtType
   * @generated
   */
  public Adapter createAdtTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.SumType <em>Sum Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.SumType
   * @generated
   */
  public Adapter createSumTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.ProdType <em>Prod Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.ProdType
   * @generated
   */
  public Adapter createProdTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.PureFunction <em>Pure Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.PureFunction
   * @generated
   */
  public Adapter createPureFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.EffectFullFunction <em>Effect Full Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.EffectFullFunction
   * @generated
   */
  public Adapter createEffectFullFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.MainFunc <em>Main Func</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.MainFunc
   * @generated
   */
  public Adapter createMainFuncAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.ChainElement <em>Chain Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.ChainElement
   * @generated
   */
  public Adapter createChainElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.InitialPureChainElement <em>Initial Pure Chain Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.InitialPureChainElement
   * @generated
   */
  public Adapter createInitialPureChainElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.EffectFullArgument <em>Effect Full Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.EffectFullArgument
   * @generated
   */
  public Adapter createEffectFullArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.FunctionBodyPure <em>Function Body Pure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.FunctionBodyPure
   * @generated
   */
  public Adapter createFunctionBodyPureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.FunctionBodyEffectFull <em>Function Body Effect Full</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.FunctionBodyEffectFull
   * @generated
   */
  public Adapter createFunctionBodyEffectFullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.EmptyFunctionBody <em>Empty Function Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.EmptyFunctionBody
   * @generated
   */
  public Adapter createEmptyFunctionBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.CompositionFunctionBodyPure <em>Composition Function Body Pure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.CompositionFunctionBodyPure
   * @generated
   */
  public Adapter createCompositionFunctionBodyPureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.CompositionFunctionBodyEffect <em>Composition Function Body Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.CompositionFunctionBodyEffect
   * @generated
   */
  public Adapter createCompositionFunctionBodyEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.IOType <em>IO Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.IOType
   * @generated
   */
  public Adapter createIOTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.ValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.ValueType
   * @generated
   */
  public Adapter createValueTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.IntegerType <em>Integer Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.IntegerType
   * @generated
   */
  public Adapter createIntegerTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.StringType
   * @generated
   */
  public Adapter createStringTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.UnitType <em>Unit Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.UnitType
   * @generated
   */
  public Adapter createUnitTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.AdtValue <em>Adt Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.AdtValue
   * @generated
   */
  public Adapter createAdtValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.ProdValue <em>Prod Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.ProdValue
   * @generated
   */
  public Adapter createProdValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.SumValue <em>Sum Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.SumValue
   * @generated
   */
  public Adapter createSumValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.fPML.DataValue <em>Data Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.fPML.DataValue
   * @generated
   */
  public Adapter createDataValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FPMLAdapterFactory
