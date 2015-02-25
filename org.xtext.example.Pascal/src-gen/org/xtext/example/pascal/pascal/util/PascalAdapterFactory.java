/**
 */
package org.xtext.example.pascal.pascal.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.pascal.pascal.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.pascal.pascal.PascalPackage
 * @generated
 */
public class PascalAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PascalPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PascalPackage.eINSTANCE;
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
  protected PascalSwitch<Adapter> modelSwitch =
    new PascalSwitch<Adapter>()
    {
      @Override
      public Adapter casepascal(pascal object)
      {
        return createpascalAdapter();
      }
      @Override
      public Adapter caseprogram(program object)
      {
        return createprogramAdapter();
      }
      @Override
      public Adapter caseprogram_heading_block(program_heading_block object)
      {
        return createprogram_heading_blockAdapter();
      }
      @Override
      public Adapter caseidentifier_list(identifier_list object)
      {
        return createidentifier_listAdapter();
      }
      @Override
      public Adapter caseblock(block object)
      {
        return createblockAdapter();
      }
      @Override
      public Adapter casestatement_part(statement_part object)
      {
        return createstatement_partAdapter();
      }
      @Override
      public Adapter casestatement_sequence(statement_sequence object)
      {
        return createstatement_sequenceAdapter();
      }
      @Override
      public Adapter casestatement(statement object)
      {
        return createstatementAdapter();
      }
      @Override
      public Adapter caselabel(label object)
      {
        return createlabelAdapter();
      }
      @Override
      public Adapter casesimple_statement(simple_statement object)
      {
        return createsimple_statementAdapter();
      }
      @Override
      public Adapter caseassignment_statement(assignment_statement object)
      {
        return createassignment_statementAdapter();
      }
      @Override
      public Adapter casevariable(variable object)
      {
        return createvariableAdapter();
      }
      @Override
      public Adapter casevar_(var_ object)
      {
        return createvar_Adapter();
      }
      @Override
      public Adapter caseexpression_list(expression_list object)
      {
        return createexpression_listAdapter();
      }
      @Override
      public Adapter caseexpression(expression object)
      {
        return createexpressionAdapter();
      }
      @Override
      public Adapter casesimple_expression(simple_expression object)
      {
        return createsimple_expressionAdapter();
      }
      @Override
      public Adapter caseterm(term object)
      {
        return createtermAdapter();
      }
      @Override
      public Adapter casefactor(factor object)
      {
        return createfactorAdapter();
      }
      @Override
      public Adapter casenumber(number object)
      {
        return createnumberAdapter();
      }
      @Override
      public Adapter caseunsigned_number(unsigned_number object)
      {
        return createunsigned_numberAdapter();
      }
      @Override
      public Adapter casesigned_number(signed_number object)
      {
        return createsigned_numberAdapter();
      }
      @Override
      public Adapter caseset(set object)
      {
        return createsetAdapter();
      }
      @Override
      public Adapter casefunction_designator(function_designator object)
      {
        return createfunction_designatorAdapter();
      }
      @Override
      public Adapter casestructured_statement(structured_statement object)
      {
        return createstructured_statementAdapter();
      }
      @Override
      public Adapter casecompound_statement(compound_statement object)
      {
        return createcompound_statementAdapter();
      }
      @Override
      public Adapter caserepetitive_statement(repetitive_statement object)
      {
        return createrepetitive_statementAdapter();
      }
      @Override
      public Adapter casewhile_statement(while_statement object)
      {
        return createwhile_statementAdapter();
      }
      @Override
      public Adapter caserepeat_statement(repeat_statement object)
      {
        return createrepeat_statementAdapter();
      }
      @Override
      public Adapter casefor_statement(for_statement object)
      {
        return createfor_statementAdapter();
      }
      @Override
      public Adapter caseconditional_statement(conditional_statement object)
      {
        return createconditional_statementAdapter();
      }
      @Override
      public Adapter caseif_statement(if_statement object)
      {
        return createif_statementAdapter();
      }
      @Override
      public Adapter casecase_statement(case_statement object)
      {
        return createcase_statementAdapter();
      }
      @Override
      public Adapter casecase_limb(case_limb object)
      {
        return createcase_limbAdapter();
      }
      @Override
      public Adapter casecase_label_list(case_label_list object)
      {
        return createcase_label_listAdapter();
      }
      @Override
      public Adapter caseconstant(constant object)
      {
        return createconstantAdapter();
      }
      @Override
      public Adapter casewith_statement(with_statement object)
      {
        return createwith_statementAdapter();
      }
      @Override
      public Adapter casegoto_statement(goto_statement object)
      {
        return creategoto_statementAdapter();
      }
      @Override
      public Adapter casedeclaration_part(declaration_part object)
      {
        return createdeclaration_partAdapter();
      }
      @Override
      public Adapter caselabel_declaration_part(label_declaration_part object)
      {
        return createlabel_declaration_partAdapter();
      }
      @Override
      public Adapter caseconstant_definition_part(constant_definition_part object)
      {
        return createconstant_definition_partAdapter();
      }
      @Override
      public Adapter caseconstant_definition(constant_definition object)
      {
        return createconstant_definitionAdapter();
      }
      @Override
      public Adapter casetype_definition_part(type_definition_part object)
      {
        return createtype_definition_partAdapter();
      }
      @Override
      public Adapter casetype_definition(type_definition object)
      {
        return createtype_definitionAdapter();
      }
      @Override
      public Adapter casetype(type object)
      {
        return createtypeAdapter();
      }
      @Override
      public Adapter casesimple_type(simple_type object)
      {
        return createsimple_typeAdapter();
      }
      @Override
      public Adapter casesubrange_type(subrange_type object)
      {
        return createsubrange_typeAdapter();
      }
      @Override
      public Adapter caseenumerated_type(enumerated_type object)
      {
        return createenumerated_typeAdapter();
      }
      @Override
      public Adapter casestructured_type(structured_type object)
      {
        return createstructured_typeAdapter();
      }
      @Override
      public Adapter caseunpacked_structured_type(unpacked_structured_type object)
      {
        return createunpacked_structured_typeAdapter();
      }
      @Override
      public Adapter casearray_type(array_type object)
      {
        return createarray_typeAdapter();
      }
      @Override
      public Adapter casedynamic_array_type(dynamic_array_type object)
      {
        return createdynamic_array_typeAdapter();
      }
      @Override
      public Adapter caseindex_type(index_type object)
      {
        return createindex_typeAdapter();
      }
      @Override
      public Adapter caserecord_type(record_type object)
      {
        return createrecord_typeAdapter();
      }
      @Override
      public Adapter casefield_list(field_list object)
      {
        return createfield_listAdapter();
      }
      @Override
      public Adapter casefixed_part(fixed_part object)
      {
        return createfixed_partAdapter();
      }
      @Override
      public Adapter caserecord_section(record_section object)
      {
        return createrecord_sectionAdapter();
      }
      @Override
      public Adapter casevariant_part(variant_part object)
      {
        return createvariant_partAdapter();
      }
      @Override
      public Adapter casetag_field(tag_field object)
      {
        return createtag_fieldAdapter();
      }
      @Override
      public Adapter casevariant(variant object)
      {
        return createvariantAdapter();
      }
      @Override
      public Adapter caseset_type(set_type object)
      {
        return createset_typeAdapter();
      }
      @Override
      public Adapter casefile_type(file_type object)
      {
        return createfile_typeAdapter();
      }
      @Override
      public Adapter casepointer_type(pointer_type object)
      {
        return createpointer_typeAdapter();
      }
      @Override
      public Adapter casevariable_declaration_part(variable_declaration_part object)
      {
        return createvariable_declaration_partAdapter();
      }
      @Override
      public Adapter caseprocedure_and_function_declaration_part(procedure_and_function_declaration_part object)
      {
        return createprocedure_and_function_declaration_partAdapter();
      }
      @Override
      public Adapter caseprocedure_declaration(procedure_declaration object)
      {
        return createprocedure_declarationAdapter();
      }
      @Override
      public Adapter caseprocedure_heading(procedure_heading object)
      {
        return createprocedure_headingAdapter();
      }
      @Override
      public Adapter caseformal_parameter_list(formal_parameter_list object)
      {
        return createformal_parameter_listAdapter();
      }
      @Override
      public Adapter caseformal_parameter_section(formal_parameter_section object)
      {
        return createformal_parameter_sectionAdapter();
      }
      @Override
      public Adapter casevalue_parameter_section(value_parameter_section object)
      {
        return createvalue_parameter_sectionAdapter();
      }
      @Override
      public Adapter caseparameter_type(parameter_type object)
      {
        return createparameter_typeAdapter();
      }
      @Override
      public Adapter caseconformant_array_schema(conformant_array_schema object)
      {
        return createconformant_array_schemaAdapter();
      }
      @Override
      public Adapter casepacked_conformant_array_schema(packed_conformant_array_schema object)
      {
        return createpacked_conformant_array_schemaAdapter();
      }
      @Override
      public Adapter casebound_specification(bound_specification object)
      {
        return createbound_specificationAdapter();
      }
      @Override
      public Adapter caseunpacked_conformant_array_schema(unpacked_conformant_array_schema object)
      {
        return createunpacked_conformant_array_schemaAdapter();
      }
      @Override
      public Adapter casevariable_parameter_section(variable_parameter_section object)
      {
        return createvariable_parameter_sectionAdapter();
      }
      @Override
      public Adapter casefunction_heading(function_heading object)
      {
        return createfunction_headingAdapter();
      }
      @Override
      public Adapter casefunction_declaration(function_declaration object)
      {
        return createfunction_declarationAdapter();
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
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.pascal <em>pascal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.pascal
   * @generated
   */
  public Adapter createpascalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.program <em>program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.program
   * @generated
   */
  public Adapter createprogramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.program_heading_block <em>program heading block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.program_heading_block
   * @generated
   */
  public Adapter createprogram_heading_blockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.identifier_list <em>identifier list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.identifier_list
   * @generated
   */
  public Adapter createidentifier_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.block <em>block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.block
   * @generated
   */
  public Adapter createblockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.statement_part <em>statement part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.statement_part
   * @generated
   */
  public Adapter createstatement_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.statement_sequence <em>statement sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.statement_sequence
   * @generated
   */
  public Adapter createstatement_sequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.statement
   * @generated
   */
  public Adapter createstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.label <em>label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.label
   * @generated
   */
  public Adapter createlabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.simple_statement <em>simple statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.simple_statement
   * @generated
   */
  public Adapter createsimple_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.assignment_statement <em>assignment statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.assignment_statement
   * @generated
   */
  public Adapter createassignment_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.variable <em>variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.variable
   * @generated
   */
  public Adapter createvariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.var_ <em>var </em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.var_
   * @generated
   */
  public Adapter createvar_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.expression_list <em>expression list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.expression_list
   * @generated
   */
  public Adapter createexpression_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.expression
   * @generated
   */
  public Adapter createexpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.simple_expression <em>simple expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.simple_expression
   * @generated
   */
  public Adapter createsimple_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.term <em>term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.term
   * @generated
   */
  public Adapter createtermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.factor <em>factor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.factor
   * @generated
   */
  public Adapter createfactorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.number <em>number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.number
   * @generated
   */
  public Adapter createnumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.unsigned_number <em>unsigned number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.unsigned_number
   * @generated
   */
  public Adapter createunsigned_numberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.signed_number <em>signed number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.signed_number
   * @generated
   */
  public Adapter createsigned_numberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.set <em>set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.set
   * @generated
   */
  public Adapter createsetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.function_designator <em>function designator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.function_designator
   * @generated
   */
  public Adapter createfunction_designatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.structured_statement <em>structured statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.structured_statement
   * @generated
   */
  public Adapter createstructured_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.compound_statement <em>compound statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.compound_statement
   * @generated
   */
  public Adapter createcompound_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.repetitive_statement <em>repetitive statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.repetitive_statement
   * @generated
   */
  public Adapter createrepetitive_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.while_statement <em>while statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.while_statement
   * @generated
   */
  public Adapter createwhile_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.repeat_statement <em>repeat statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.repeat_statement
   * @generated
   */
  public Adapter createrepeat_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.for_statement <em>for statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.for_statement
   * @generated
   */
  public Adapter createfor_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.conditional_statement <em>conditional statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.conditional_statement
   * @generated
   */
  public Adapter createconditional_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.if_statement <em>if statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.if_statement
   * @generated
   */
  public Adapter createif_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.case_statement <em>case statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.case_statement
   * @generated
   */
  public Adapter createcase_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.case_limb <em>case limb</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.case_limb
   * @generated
   */
  public Adapter createcase_limbAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.case_label_list <em>case label list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.case_label_list
   * @generated
   */
  public Adapter createcase_label_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.constant <em>constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.constant
   * @generated
   */
  public Adapter createconstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.with_statement <em>with statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.with_statement
   * @generated
   */
  public Adapter createwith_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.goto_statement <em>goto statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.goto_statement
   * @generated
   */
  public Adapter creategoto_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.declaration_part <em>declaration part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.declaration_part
   * @generated
   */
  public Adapter createdeclaration_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.label_declaration_part <em>label declaration part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.label_declaration_part
   * @generated
   */
  public Adapter createlabel_declaration_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.constant_definition_part <em>constant definition part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.constant_definition_part
   * @generated
   */
  public Adapter createconstant_definition_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.constant_definition <em>constant definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.constant_definition
   * @generated
   */
  public Adapter createconstant_definitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.type_definition_part <em>type definition part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.type_definition_part
   * @generated
   */
  public Adapter createtype_definition_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.type_definition <em>type definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.type_definition
   * @generated
   */
  public Adapter createtype_definitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.type <em>type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.type
   * @generated
   */
  public Adapter createtypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.simple_type <em>simple type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.simple_type
   * @generated
   */
  public Adapter createsimple_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.subrange_type <em>subrange type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.subrange_type
   * @generated
   */
  public Adapter createsubrange_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.enumerated_type <em>enumerated type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.enumerated_type
   * @generated
   */
  public Adapter createenumerated_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.structured_type <em>structured type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.structured_type
   * @generated
   */
  public Adapter createstructured_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.unpacked_structured_type <em>unpacked structured type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.unpacked_structured_type
   * @generated
   */
  public Adapter createunpacked_structured_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.array_type <em>array type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.array_type
   * @generated
   */
  public Adapter createarray_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.dynamic_array_type <em>dynamic array type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.dynamic_array_type
   * @generated
   */
  public Adapter createdynamic_array_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.index_type <em>index type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.index_type
   * @generated
   */
  public Adapter createindex_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.record_type <em>record type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.record_type
   * @generated
   */
  public Adapter createrecord_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.field_list <em>field list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.field_list
   * @generated
   */
  public Adapter createfield_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.fixed_part <em>fixed part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.fixed_part
   * @generated
   */
  public Adapter createfixed_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.record_section <em>record section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.record_section
   * @generated
   */
  public Adapter createrecord_sectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.variant_part <em>variant part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.variant_part
   * @generated
   */
  public Adapter createvariant_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.tag_field <em>tag field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.tag_field
   * @generated
   */
  public Adapter createtag_fieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.variant <em>variant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.variant
   * @generated
   */
  public Adapter createvariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.set_type <em>set type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.set_type
   * @generated
   */
  public Adapter createset_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.file_type <em>file type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.file_type
   * @generated
   */
  public Adapter createfile_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.pointer_type <em>pointer type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.pointer_type
   * @generated
   */
  public Adapter createpointer_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.variable_declaration_part <em>variable declaration part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.variable_declaration_part
   * @generated
   */
  public Adapter createvariable_declaration_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.procedure_and_function_declaration_part <em>procedure and function declaration part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.procedure_and_function_declaration_part
   * @generated
   */
  public Adapter createprocedure_and_function_declaration_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.procedure_declaration <em>procedure declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.procedure_declaration
   * @generated
   */
  public Adapter createprocedure_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.procedure_heading <em>procedure heading</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.procedure_heading
   * @generated
   */
  public Adapter createprocedure_headingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.formal_parameter_list <em>formal parameter list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.formal_parameter_list
   * @generated
   */
  public Adapter createformal_parameter_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.formal_parameter_section <em>formal parameter section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.formal_parameter_section
   * @generated
   */
  public Adapter createformal_parameter_sectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.value_parameter_section <em>value parameter section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.value_parameter_section
   * @generated
   */
  public Adapter createvalue_parameter_sectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.parameter_type <em>parameter type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.parameter_type
   * @generated
   */
  public Adapter createparameter_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.conformant_array_schema <em>conformant array schema</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.conformant_array_schema
   * @generated
   */
  public Adapter createconformant_array_schemaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.packed_conformant_array_schema <em>packed conformant array schema</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.packed_conformant_array_schema
   * @generated
   */
  public Adapter createpacked_conformant_array_schemaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.bound_specification <em>bound specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.bound_specification
   * @generated
   */
  public Adapter createbound_specificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.unpacked_conformant_array_schema <em>unpacked conformant array schema</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.unpacked_conformant_array_schema
   * @generated
   */
  public Adapter createunpacked_conformant_array_schemaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.variable_parameter_section <em>variable parameter section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.variable_parameter_section
   * @generated
   */
  public Adapter createvariable_parameter_sectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.function_heading <em>function heading</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.function_heading
   * @generated
   */
  public Adapter createfunction_headingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.function_declaration <em>function declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.function_declaration
   * @generated
   */
  public Adapter createfunction_declarationAdapter()
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

} //PascalAdapterFactory
