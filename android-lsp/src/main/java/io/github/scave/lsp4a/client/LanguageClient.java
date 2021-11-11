package io.github.scave.lsp4a.client;

import java.util.List;

import io.github.scave.lsp4a.model.code.CodeAction;
import io.github.scave.lsp4a.model.code.CodeLens;
import io.github.scave.lsp4a.model.common.Location;
import io.github.scave.lsp4a.model.completion.CompletionResult;
import io.github.scave.lsp4a.model.document.highlight.DocumentHighlight;
import io.github.scave.lsp4a.model.document.link.DocumentLink;
import io.github.scave.lsp4a.model.document.modify.TextEdit;
import io.github.scave.lsp4a.model.folding.FoldingRange;
import io.github.scave.lsp4a.model.lifecycle.InitializeResult;
import io.github.scave.lsp4a.model.markup.Hover;
import io.github.scave.lsp4a.model.rename.RenameResponse;
import io.github.scave.lsp4a.model.signature.SignatureHelp;
import io.github.scave.lsp4a.model.symbol.SymbolInfo;
import io.github.scave.lsp4a.model.workspace.WorkspaceEdit;
import io.github.scave.lsp4a.util.Optional;

/**
 * The base class of all language clients.
 * In other words, all of the language clients must implements this interface
 * @author Scave
 */
public interface LanguageClient {

    /**
     * While the client receive the result of initializing
     * @param result The instance of InitializeResult
     */
    void receiveInitializeResult(InitializeResult result);

    /**
     * While the client receive the completion result
     * @param result The completion result
     */
    void receiveCompletionResult(Optional<CompletionResult> result);

    /**
     * While the client receive the hovered information
     * @param hover result
     */
    void receiveHover(Optional<Hover> hover);

    /**
     * While the client receive the signature help
     * @param signature result
     */
    void receiveSignatureHelp(Optional<SignatureHelp> signature);

    /**
     * While the client receive the definition
     * @param locations result
     */
    void receiveDefinitions(Optional<List<Location>> locations);

    /**
     * While the client receive the references
     * @param locations result
     */
    void receiveReferences(Optional<List<Location>> locations);

    /**
     * While the client receive the symbols of document
     * @param symbols result
     */
    void receiveDocumentSymbols(List<SymbolInfo> symbols);

    /**
     * While the client receive the symbols of workspace
     * @param symbols result
     */
    void receiveWorkspaceSymbols(List<SymbolInfo> symbols);

    /**
     * While the client receive the code actions of document
     * @param actions result
     */
    void receiveCodeActions(List<CodeAction> actions);

    /**
     * While the client receive the code actions of document
     * @param lens result
     */
    void receiveCodeLens(List<CodeLens> lens);

    /**
     * While the client receive the signature help
     * @param response result
     */
    void receiveRenameResponse(Optional<RenameResponse> response);

    /**
     * While the client receive the workspace edit
     * @param edit result
     */
    void receiveWorkspaceEdit(WorkspaceEdit edit);

    /**
     * While the client receive the text edits of a text document
     * @param edits result
     */
    void receiveTextEdits(List<TextEdit> edits);

    /**
     * While the client receive the highlight result of a text document
     * @param highlights result
     */
    void receiveHighlights(List<DocumentHighlight> highlights);

    /**
     * While the client receive the folding ranges of a text document
     * @param ranges result
     */
    void receiveFoldingRanges(List<FoldingRange> ranges);

    /**
     * While the client receive the links in a text document
     * @param links result
     */
    void receiveDocumentLinks(List<DocumentLink> links);
}