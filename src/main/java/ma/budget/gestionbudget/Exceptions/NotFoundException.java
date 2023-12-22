package ma.budget.gestionbudget.Exceptions;

import org.aspectj.weaver.ast.Not;

public class NotFoundException extends Exception{
    public NotFoundException(String message)
    {
        super(message);
    }

}
