// Generated from C:/Users/urak_/Documents/___1.felev(mesteri)/ModSoft/ANTLR/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StateModelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StateModelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(StateModelParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#statesAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatesAll(StateModelParser.StatesAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#stateWithModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateWithModifier(StateModelParser.StateWithModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(StateModelParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#initState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitState(StateModelParser.InitStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#errorState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorState(StateModelParser.ErrorStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#transitionsAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionsAll(StateModelParser.TransitionsAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(StateModelParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema(StateModelParser.SchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(StateModelParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(StateModelParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#startState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartState(StateModelParser.StartStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#endState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndState(StateModelParser.EndStateContext ctx);
}