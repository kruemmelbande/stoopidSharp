public class variable {
    // a variable is a name, a content type, and a value
    public variable(String name, String type, String value) throws InvalidVariable {
        this.name = name;
        this.type = type;
        switch (type) {
            case "string":
                this.stringValue = value;
                break;
            case "int":
                try {
                    this.intValue = Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    throw new InvalidVariable("Invalid variable value for int: " + value);
                }
                break;
            case "float":
                try {
                    this.floatValue = Double.parseDouble(value);
                } catch (NumberFormatException e) {
                    throw new InvalidVariable("Invalid variable value for float: " + value);
                }
                break;
            case "bool":
                if (value.equals("true")){
                    this.intValue = 1;
                } else if (value.equals("false")) {
                    this.intValue = 0;
                } else {
                    throw new InvalidVariable("Invalid variable value for bool: " + value + " (expected true or false)");
                }
                break;
            default:
                throw new InvalidVariable("Invalid variable type");
        }
    }
    public String name;
    public String type;
    public String stringValue;
    public int intValue;
    public double floatValue;
    
    public boolean thisMe(String name) {
        return this.name.equals(name);
    }
    public boolean isString() {
        return type.equals("string");
    }
    public boolean isInt() {
        return type.equals("int");
    }
    public boolean isFloat() {
        return type.equals("float");
    }
    
    public String toString() {
        switch (type) {
            case "string":
                return stringValue;
            case "int":
                return Integer.toString(intValue);
            case "float":
                return Double.toString(floatValue);
            case "bool":
                if (intValue == 1) {
                    return "true";
                } else {
                    return "false";
                }
            default:
                return "Invalid variable type";
        }
    }

    public double toDouble() throws InvalidVariable {
        switch (type) {
            case "string":
                try {
                    return Double.parseDouble(stringValue);
                } catch (NumberFormatException e) {
                    throw new InvalidVariable("Invalid variable value for float: " + stringValue);
                }

            case "int":
                return (double) intValue;
            case "float":
                return floatValue;
            case "bool":
                return (double) intValue;
            default:
                throw new InvalidVariable("Invalid variable type");
        }
    }
    
    public int toInt() throws InvalidVariable {
        switch (type) {
            case "string":
                try {
                    return Integer.parseInt(stringValue);
                } catch (NumberFormatException e) {
                    throw new InvalidVariable("Invalid variable value for int: " + stringValue);
                }
            case "int":
                return intValue;
            case "float":
                return (int) floatValue;
            case "bool":
                return intValue;
            default:
                throw new InvalidVariable("Invalid variable type");
        }
    }
    public void setValue(String value) throws InvalidVariable {
        switch (type) {
            case "string":
                stringValue = value;
                break;
            case "int":
                try {
                    intValue = Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    throw new InvalidVariable("Invalid variable value for int: " + value);
                }
                break;
            case "float":
                try {
                    floatValue = Double.parseDouble(value);
                } catch (NumberFormatException e) {
                    throw new InvalidVariable("Invalid variable value for float: " + value);
                }
                break;
            case "bool":
                if (value.equals("true")) {
                    intValue = 1;
                } else if (value.equals("false")) {
                    intValue = 0;
                } else {
                    throw new InvalidVariable("Invalid variable value for bool: " + value + " (expected true or false)");
                }
                break;
            default:
                throw new InvalidVariable("Invalid variable type");
        }
    }
}
