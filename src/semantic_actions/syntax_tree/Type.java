package semantic_actions.syntax_tree;

import semantic_actions.visitor.*;
//import visitor.TypeVisitor;

public abstract class Type {
  public abstract void accept(Visitor v);
  public abstract Type accept(TypeVisitor v);
}