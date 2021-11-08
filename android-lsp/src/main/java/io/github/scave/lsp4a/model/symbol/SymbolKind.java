package io.github.scave.lsp4a.model.symbol;

/**
 * The class define the kinds of symbols
 * @author Scave
 */
public class SymbolKind {

    /**
     * The symbol is a file
     */
    public static final int FILE = 1;
    /**
     * The symbol is a module
     */
    public static final int MODULE = 2;
    /**
     * The symbol is a namespace
     */
    public static final int NAMESPACE = 3;
    /**
     * The symbol is a package
     */
    public static final int PACKAGE = 4;
    /**
     * The symbol is a class
     */
    public static final int CLASS = 5;
    /**
     * The symbol is a interface
     */
    public static final int INTERFACE = 6;
    /**
     * The symbol is a enum
     */
    public static final int ENUM = 7;
    /**
     * The symbol is a struct
     */
    public static final int STRUCT = 8;
    /**
     * The symbol is a method
     */
    public static final int METHOD = 9;
    /**
     * The symbol is a function
     */
    public static final int FUNCTION = 10;
    /**
     * The symbol is a constructor
     */
    public static final int CONSTRUCTOR = 11;
    /**
     * The symbol is a event
     */
    public static final int EVENT = 12;
    /**
     * The symbol is a property
     */
    public static final int PROPERTY = 13;
    /**
     * The symbol is a field
     */
    public static final int FIELD = 14;
    /**
     * The symbol is a member of enum class
     */
    public static final int ENUM_MEMBER = 15;
    /**
     * The symbol is a variable
     */
    public static final int VARIABLE = 16;
    /**
     * The symbol is a constant
     */
    public static final int CONSTANT = 17;
    /**
     * The symbol is a parameter of type(class)
     */
    public static final int TYPE_PARAMETER = 18;
    /**
     * The symbol is a string literal
     */
    public static final int STRING = 19;
    /**
     * The symbol is a number literal
     */
    public static final int NUMBER = 20;
    /**
     * The symbol is a boolean literal
     */
    public static final int BOOLEAN = 21;
    /**
     * The symbol is a array
     */
    public static final int ARRAY = 22;
    /**
     * The symbol is a object
     */
    public static final int OBJECT = 23;
    /**
     * The symbol is a key
     */
    public static final int KEY = 24;
    /**
     * The symbol is null object
     */
    public static final int NULL = 25;

}
