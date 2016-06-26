// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.antlr.AST;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.base.excepthandler;
import org.python.antlr.base.expr;
import org.python.antlr.base.mod;
import org.python.antlr.base.slice;
import org.python.antlr.base.stmt;
import org.python.core.ArgParser;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyStringMap;
import org.python.core.PyType;
import org.python.core.Visitproc;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;

public abstract class VisitorBase<R> implements VisitorIF<R> {
    public R visitModule(Module node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitInteractive(Interactive node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitExpression(Expression node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitSuite(Suite node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitFunctionDef(FunctionDef node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitAsyncFunctionDef(AsyncFunctionDef node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitClassDef(ClassDef node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitReturn(Return node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitDelete(Delete node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitAssign(Assign node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitAugAssign(AugAssign node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitPrint(Print node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitFor(For node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitAsyncFor(AsyncFor node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitWhile(While node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitIf(If node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitWith(With node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitAsyncWith(AsyncWith node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitRaise(Raise node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitTryExcept(TryExcept node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitTryFinally(TryFinally node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitAssert(Assert node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitImport(Import node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitImportFrom(ImportFrom node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitExec(Exec node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitGlobal(Global node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitNonlocal(Nonlocal node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitExpr(Expr node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitPass(Pass node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitBreak(Break node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitContinue(Continue node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitBoolOp(BoolOp node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitBinOp(BinOp node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitUnaryOp(UnaryOp node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitLambda(Lambda node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitIfExp(IfExp node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitDict(Dict node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitSet(Set node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitListComp(ListComp node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitSetComp(SetComp node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitDictComp(DictComp node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitGeneratorExp(GeneratorExp node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitAwait(Await node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitYield(Yield node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitYieldFrom(YieldFrom node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitCompare(Compare node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitCall(Call node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitRepr(Repr node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitNum(Num node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitStr(Str node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitNameConstant(NameConstant node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitEllipsis(Ellipsis node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitAttribute(Attribute node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitSubscript(Subscript node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitStarred(Starred node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitName(Name node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitList(List node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitTuple(Tuple node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitSlice(Slice node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitExtSlice(ExtSlice node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitIndex(Index node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    public R visitExceptHandler(ExceptHandler node) throws Exception {
        R ret = unhandled_node(node);
        traverse(node);
        return ret;
    }

    abstract protected R unhandled_node(PythonTree node) throws Exception;
    abstract public void traverse(PythonTree node) throws Exception;
}
