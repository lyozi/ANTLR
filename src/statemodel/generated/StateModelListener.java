// Generated from C:/Users/urak_/Documents/___1.felev(mesteri)/ModSoft/ANTLR/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StateModelParser}.
 */
public interface StateModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(StateModelParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(StateModelParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#statesAll}.
	 * @param ctx the parse tree
	 */
	void enterStatesAll(StateModelParser.StatesAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#statesAll}.
	 * @param ctx the parse tree
	 */
	void exitStatesAll(StateModelParser.StatesAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#stateWithModifier}.
	 * @param ctx the parse tree
	 */
	void enterStateWithModifier(StateModelParser.StateWithModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#stateWithModifier}.
	 * @param ctx the parse tree
	 */
	void exitStateWithModifier(StateModelParser.StateWithModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(StateModelParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(StateModelParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#initState}.
	 * @param ctx the parse tree
	 */
	void enterInitState(StateModelParser.InitStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#initState}.
	 * @param ctx the parse tree
	 */
	void exitInitState(StateModelParser.InitStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#errorState}.
	 * @param ctx the parse tree
	 */
	void enterErrorState(StateModelParser.ErrorStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#errorState}.
	 * @param ctx the parse tree
	 */
	void exitErrorState(StateModelParser.ErrorStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitionsAll}.
	 * @param ctx the parse tree
	 */
	void enterTransitionsAll(StateModelParser.TransitionsAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitionsAll}.
	 * @param ctx the parse tree
	 */
	void exitTransitionsAll(StateModelParser.TransitionsAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(StateModelParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(StateModelParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(StateModelParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(StateModelParser.SchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(StateModelParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(StateModelParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(StateModelParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(StateModelParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#startState}.
	 * @param ctx the parse tree
	 */
	void enterStartState(StateModelParser.StartStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#startState}.
	 * @param ctx the parse tree
	 */
	void exitStartState(StateModelParser.StartStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#endState}.
	 * @param ctx the parse tree
	 */
	void enterEndState(StateModelParser.EndStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#endState}.
	 * @param ctx the parse tree
	 */
	void exitEndState(StateModelParser.EndStateContext ctx);
}