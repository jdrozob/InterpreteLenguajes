/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interpretelenguajes;

import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/*
 *
 * @author TOSHIBA
 */
public class InterpreteLenguajes{
    
    public static void main(String[] args) throws Exception {
        
        proyectoLenguajesLexer lexer = new proyectoLenguajesLexer(new ANTLRFileStream("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\InterpreteLenguajes\\InterpreteLenguajes\\src\\interpretelenguajes\\test.proyectoLenguajes"));
        proyectoLenguajesParser parser = new proyectoLenguajesParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    } 
}
