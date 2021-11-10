package io.github.scave.lsp4a.server;

import java.util.List;
import java.util.Optional;

import io.github.scave.lsp4a.model.action.DidChangeConfigurationParams;
import io.github.scave.lsp4a.model.action.DidChangeTextDocumentParams;
import io.github.scave.lsp4a.model.action.DidChangeWatchedFilesParams;
import io.github.scave.lsp4a.model.action.DidChangeWorkspaceFoldersParams;
import io.github.scave.lsp4a.model.action.DidCloseTextDocumentParams;
import io.github.scave.lsp4a.model.action.DidOpenTextDocumentParams;
import io.github.scave.lsp4a.model.action.DidSaveTextDocumentParams;
import io.github.scave.lsp4a.model.code.CodeAction;
import io.github.scave.lsp4a.model.code.CodeActionParams;
import io.github.scave.lsp4a.model.code.CodeLens;
import io.github.scave.lsp4a.model.code.CodeLensParams;
import io.github.scave.lsp4a.model.common.Location;
import io.github.scave.lsp4a.model.completion.CompletionItem;
import io.github.scave.lsp4a.model.completion.CompletionResult;
import io.github.scave.lsp4a.model.document.TextDocumentPositionParams;
import io.github.scave.lsp4a.model.document.formatting.DocumentFormattingParams;
import io.github.scave.lsp4a.model.document.link.DocumentLink;
import io.github.scave.lsp4a.model.document.link.DocumentLinkParams;
import io.github.scave.lsp4a.model.document.modify.TextEdit;
import io.github.scave.lsp4a.model.document.save.WillSaveTextDocumentParams;
import io.github.scave.lsp4a.model.document.symbol.DocumentSymbolParams;
import io.github.scave.lsp4a.model.folding.FoldingRange;
import io.github.scave.lsp4a.model.folding.FoldingRangeParams;
import io.github.scave.lsp4a.model.lifecycle.InitializeParams;
import io.github.scave.lsp4a.model.lifecycle.InitializeResult;
import io.github.scave.lsp4a.model.markup.Hover;
import io.github.scave.lsp4a.model.reference.ReferenceParams;
import io.github.scave.lsp4a.model.rename.RenameParams;
import io.github.scave.lsp4a.model.rename.RenameResponse;
import io.github.scave.lsp4a.model.signature.SignatureHelp;
import io.github.scave.lsp4a.model.symbol.SymbolInfo;
import io.github.scave.lsp4a.model.workspace.WorkspaceEdit;
import io.github.scave.lsp4a.model.workspace.WorkspaceSymbolParams;

/**
 * The base class of all language servers
 * In other words, all of the language servers must implements this interface!
 * @author Scave
 */
public interface LanguageServer {

    /**
     * Initialize the language server
     * @param params The params of initializing
     * @return The result of initializing
     */
    InitializeResult initialize(InitializeParams params);

    /**
     * This method will be called after the language server initialized
     */
    void initialized();

    /**
     * This method will be called after the language server closed
     */
    void shutdown();

    /**
     * Notify the server that the configuration was changed
     * @param params The params of changed configuration
     */
    void didChangeConfiguration(DidChangeConfigurationParams params);

    /**
     * Notify the server that a text document was opened
     * @param params The params of opened text document
     */
    void didOpenTextDocument(DidOpenTextDocumentParams params);

    /**
     * Notify the server that a text document's content has been changed
     * @param params The params of a text document which was changed
     */
    void didChangeTextDocument(DidChangeTextDocumentParams params);

    /**
     * Notify the server that a text document will be saved
     * @param params The params of a text document which will be saved
     */
    void willSaveTextDocument(WillSaveTextDocumentParams params);

    /**
     * Notify the server that a text document will be saved
     *   but still wait for text editions of the document
     * @param params The params of a text document which will be saved
     * @return The text editions for document
     */
    List<TextEdit> willSaveWaitUntilTextDocument(WillSaveTextDocumentParams params);

    /**
     * 通知已保存文本文档
     * @param params 已保存文本文档参数信息
     */
    void didSaveTextDocument(DidSaveTextDocumentParams params);

    /**
     * Notify the server that a text document has been saved
     * @param params The params of a text document which has been saved
     */
    void didCloseTextDocument(DidCloseTextDocumentParams params);

    /**
     * Notify the server that the files which were watched has been changed
     * @param params The params of changed files
     */
    void didChangeWatchedFiles(DidChangeWatchedFilesParams params);

    /**
     * Notify the server that a workspace folder has been changed
     * @param params The params of a workspace folder which has been changed
     */
    void didChangeWorkspaceFolders(DidChangeWorkspaceFoldersParams params);

    /**
     * Notify the server should return completion result for user now
     * @param params The params of current position in specified text document
     */
    Optional<CompletionResult> completion(TextDocumentPositionParams params);

    /**
     * Notify the server should resolve the completion item is correct
     * @param item The completion item which will be resolved
     */
    CompletionItem resolveCompletionItem(CompletionItem item);

    /**
     * Notify the server that the mouse has hovered on marked content
     * @param params The params of current position in specific text document
     */
    Optional<Hover> hover(TextDocumentPositionParams params);

    /**
     * Notify the server should return specific signature of symbol
     * @param params The params of current position in specified text document
     */
    Optional<SignatureHelp> signatureHelp(TextDocumentPositionParams params);

    /**
     * Notify the server should return locations of specific symbol's definition
     * A symbol, such as method maybe has many definitions(Override method in Java)
     * Or it can be definition and implements in C++
     * ...
     * @param params The params of current position in specified text document
     */
    Optional<List<Location>> gotoDefinition(TextDocumentPositionParams params);

    /**
     * Notify the server should return locations of specific symbol's references
     * A symbol, such as variable, it can be referenced more than once
     * @param params The params of reference, it contains position information and reference context
     */
    Optional<List<Location>> findReferences(ReferenceParams params);

    /**
     * Notify the server should return symbol information of a text document
     * @param params The params of a specific text document
     */
    List<SymbolInfo> documentSymbol(DocumentSymbolParams params);

    /**
     * Notify the server should return symbol information of a workspace folder
     * @param params The params of a specific workspace folder
     */
    List<SymbolInfo> workspaceSymbols(WorkspaceSymbolParams params);

    /**
     * Notify the server should return accessible actions of specific code
     * For example, auto import, auto fixing
     * @param params The params of code action request
     */
    List<CodeAction> codeAction(CodeActionParams params);

    /**
     * Notify the server should return code length of specific text document
     * @param params The params of code length request, it contains a only identifier of text document
     */
    List<CodeLens> codeLens(CodeLensParams params);

    /**
     * Notify the server should resolve a code length model
     * @param params The instance of CodeLens
     */
    CodeLens resolveCodeLens(CodeLens params);

    /**
     * Notify the server should prepare to rename symbol in a text document
     * @param params The params of current position in text document
     * @return The information after prepared
     */
    Optional<RenameResponse> prepareRename(TextDocumentPositionParams params);

    /**
     * Notify the server should rename a specific symbol
     * @param params The params of renaming operation
     */
    WorkspaceEdit rename(RenameParams params);

    /**
     * Notify the server should format specific text document
     * @param params The params of formatting, it contains the identifier of document and formatting options
     */
    List<TextEdit> formatting(DocumentFormattingParams params);

    /**
     * Notify the server should return the folding range in a specific text document
     * @param params The params of folding range request
     */
    List<FoldingRange> foldingRange(FoldingRangeParams params);

    /**
     * Notify the server should return the links in a text document
     * @param params The params of document links request
     */
    List<DocumentLink> documentLink(DocumentLinkParams params);

    /**
     * Do some async work, for example, compile source, lint...
     */
    void doAsyncWork();
}