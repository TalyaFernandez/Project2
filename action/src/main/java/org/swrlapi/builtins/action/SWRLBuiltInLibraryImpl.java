
package org.swrlapi.builtins.action;

import java.text.DecimalFormat;

import java.util.List;

import org.swrlapi.builtins.AbstractSWRLBuiltInLibrary;
import org.swrlapi.builtins.arguments.SWRLBuiltInArgument;
import org.swrlapi.builtins.arguments.SWRLVariableBuiltInArgument;
import org.swrlapi.exceptions.SWRLBuiltInException;

public class SWRLBuiltInLibraryImpl extends AbstractSWRLBuiltInLibrary {
    
	private static String MESSAGE;

public SWRLBuiltInLibraryImpl() { super("SWRLCoreBuiltIns"); }
  public void reset() {}
  public boolean notify(List<SWRLBuiltInArgument> arguments) 
		   throws SWRLBuiltInException
		   {
	  MESSAGE="";
	  final int resultArgNumber=0, argument1Number = 1, argument2Number = 2, argument3Number = 3, argument4Number = 4,numberOfArguments = 5;
	  checkNumberOfArgumentsEqualTo(numberOfArguments, arguments.size());
		   String argument1 = getArgumentAsAString(argument1Number, arguments); //// le non de SLO
  MESSAGE += argument1+" ";
  String argument2 = getArgumentAsAString(argument2Number, arguments);  //// la valeur de SLAParameter
 
	  MESSAGE += argument2+ " "; 
  String argument3 = getArgumentAsAString(argument3Number, arguments); 
  MESSAGE += argument3+" ";
  String argument4 = getArgumentAsAString(argument4Number, arguments);  //// la valeur de SLAParameter
 
	  MESSAGE +=argument4; 
		if (isUnboundArgument(resultArgNumber, arguments)) {
			SWRLVariableBuiltInArgument resultArgument1 = arguments.get(resultArgNumber).asVariable();
			resultArgument1.setBuiltInResult(createLiteralBuiltInArgument(MESSAGE));
		}
		return true;
 }

}
