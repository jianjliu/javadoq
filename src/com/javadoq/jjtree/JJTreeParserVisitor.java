/* Generated By:JavaCC: Do not edit this line. JJTreeParserVisitor.java Version 5.0 */
package com.javadoq.jjtree;

public interface JJTreeParserVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTGrammar node, Object data);
  public Object visit(ASTCompilationUnit node, Object data);
  public Object visit(ASTPackageName node, Object data);
  public Object visit(ASTImportName node, Object data);
  public Object visit(ASTNewName node, Object data);
  public Object visit(ASTNewType node, Object data);
  public Object visit(ASTSuperList node, Object data);
  public Object visit(ASTName node, Object data);
}
/* JavaCC - OriginalChecksum=7b2f8ba1fe0096b6310f11aac3d9b63b (do not edit this line) */