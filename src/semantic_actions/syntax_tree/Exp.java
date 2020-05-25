package Semantic_actions.syntax_tree;

import Semantic_actions.visitor.*;
//import visitor.TypeVisitor;

public abstract class Exp {
  public abstract void accept(Visitor v);
  public abstract Type accept(TypeVisitor v);
}