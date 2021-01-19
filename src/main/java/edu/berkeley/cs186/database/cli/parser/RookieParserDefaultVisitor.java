/* Generated By:JavaCC: Do not edit this line. RookieParserDefaultVisitor.java Version 7.0.5 */
package edu.berkeley.cs186.database.cli.parser;

public class RookieParserDefaultVisitor implements RookieParserVisitor{
  public void defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
    return;
  }
  public void visit(SimpleNode node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTSQLStatementList node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTExplainStatement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTDropTableStatement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTDropIndexStatement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTReleaseStatement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTSavepointStatement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTRollbackStatement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTBeginStatement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTCommitStatement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTInsertStatement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTSelectStatement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTDeleteStatement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTCreateTableStatement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTCreateIndexStatement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTColumnDef node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTSelectClause node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTLimit node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTFromClause node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTJoinedTable node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTResultColumnName node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTColumnName node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTTableName node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTIdentifier node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTAliasedTableName node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTBinaryExpression node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTLiteral node, Object data){
    defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=e666adc90e974b87e8f48908f67eb085 (do not edit this line) */
