package io.github.scave.lsp4a.model.completion;

/**
 * The class define the trigger kinds of completion
 * @author Scave
 */
public class CompletionTriggerKind {
    /**
     * The completion is triggered while the user input something such as identifier, dot and so on...
     */
    public static final int INVOKED = 1;

    /**
     * The completion is triggered by specific character
     */
    public static final int TRIGGER_CHARACTER = 2;

    /**
     * The completion is triggered once again
     */
    public static final int TRIGGER_INCOMPLETE = 3;
}
