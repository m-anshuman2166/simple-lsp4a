package io.github.scave.lsp4a.server;

/**
 * 语言服务接口类
 * @author Scave
 */
public interface LanguageServer {

    /**
     * 初始化语言服务
     * @param params 初始化参数
     * @return 返回初始化结果
     */
    InitializeResult initialize(InitializeParams params);

    /**
     * 初始化完毕
     */
    void initialized();

    /**
     * 服务关闭
     */
    void shutdown();

    /**
     * 通知已经完成配置信息变更
     * @param params 变更配置信息
     */
    void didChangeConfiguration(DidChangeConfigurationParams params);

    /**
     * 通知已打开文本文档
     * @param params 打开文本文档参数信息
     */
    void didOpenTextDocument(DidOpenTextDocumentParams params);

    /**
     * 通知已经完成文本文档内容变更
     * @param params 内容变更信息
     */
    void didChangeTextDocument(DidChangeTextDocumentParams params);

    /**
     * 通知即将保存文本文档
     * @param params 即将保存文本文档参数信息
     */
    void willSaveTextDocument(WillSaveTextDocumentParams params);

    /**
     * 通知即将保存文本文档
     * @param params 即将保存文本文档参数信息
     * @return 返回已变更的文本信息
     */
    List<TextEdit> willSaveWaitUntilTextDocument(WillSaveTextDocumentParams params);

    /**
     * 通知已保存文本文档
     * @param params 已保存文本文档参数信息
     */
    void didSaveTextDocument(DidSaveTextDocumentParams params);

    /**
     * 通知已关闭文本文档
     * @param params 已关闭文本文档参数信息
     */
    void didCloseTextDocument(DidCloseTextDocumentParams params);

    /**
     * 通知监听的文件已变更
     * @param params 被监听文件的变更参数信息
     */
    void didChangeWatchedFiles(DidChangeWatchedFilesParams params);

    /**
     * 通知需要返回代码提示
     * @param params 当前所处文本文档的位置参数信息
     */
    Optional<CompletionResult> completion(TextDocumentPositionParams params);

    /**
     * 通知需要对代码提示项进行判定和变更后返回代码提示项
     * @param item 欲处理的代码提示项
     */
    CompletionItem resolveCompletionItem(CompletionItem item);

    /**
     * 通知鼠标移动到文本上，需要返回被鼠标指定的内容
     * @param params 当前所处文本文档的位置参数信息
     */
    Optional<Hover> hover(TextDocumentPositionParams params);

    /**
     * 通知需要返回函数、变量等成员的签名信息
     * @param params 当前所处文本文档的位置参数信息
     */
    Optional<SignatureHelp> signatureHelp(TextDocumentPositionParams params);

    /**
     * 通知需要返回引用成员的定义位置信息集合（多个定义，如虚拟方法、.h和.cpp内分别定义和实现等）
     * @param params 当前所处文本文档的位置参数信息
     */
    Optional<List<Location>> gotoDefinition(TextDocumentPositionParams params);

    /**
     * 通知需要返回某个成员被引用处位置信息集合
     * @param params 成员引用参数信息
     */
    Optional<List<Location>> findReferences(ReferenceParams params);

    /**
     * 通知需要返回指定文本文档的符号信息集合
     * @param params 文本文档请求符号信息参数
     */
    List<SymbolInfo> documentSymbol(DocumentSymbolParams params);

    /**
     * 通知需要返回指定工作区（文件夹等）符号信息集合
     * @param params 当前所处工作区的位置参数信息
     */
    List<SymbolInfo> workspaceSymbols(WorkspaceSymbolParams params);

    /**
     * 通知需要返回指定文档区域的代码操作（如自动修复，导入类等）集合
     * @param params 请求返回代码操作的参数信息
     */
    List<CodeAction> codeAction(CodeActionParams params);

    /**
     * 通知需要返回指定文档的代码长度信息集合
     * @param params 请求返回代码长度信息的参数信息
     */
    List<CodeLens> codeLens(CodeLensParams params);

    /**
     * 通知需要对代码长度信息进行判定和变更后返回代码长度信息
     * @param params 欲处理的代码长度信息
     */
    CodeLens resolveCodeLens(CodeLens params);

    /**
     * 通知需要准备进行重命名操作
     * @param params 当前文本文档用户指定所处位置信息
     * @return 返回重命名后的信息
     */
    Optional<RenameResponse> prepareRename(TextDocumentPositionParams params);

    /**
     * 通知进行重命名操作
     * @param params 重命名请求的参数信息
     */
    WorkspaceEdit rename(RenameParams params);

    /**
     * 通知工作区文件夹已经变更
     * @param params 工作区文件夹变更请求的参数信息
     */
    void didChangeWorkspaceFolders(DidChangeWorkspaceFoldersParams params);

    /**
     * 请求格式化文本文档并返回进行格式化操作后的文本内容变更信息（文本位置）
     * @param params 请求格式化操作的文档格式化参数信息
     */
    List<TextEdit> formatting(DocumentFormattingParams params);

    /**
     * 通知需要返回指定文本文档的代码折叠区域信息
     * @param params 请求代码折叠区域信息的参数信息
     */
    List<FoldingRange> foldingRange(FoldingRangeParams params);

    /**
     * 通知需要返回指定文本文档的文档内超链接的信息集合
     * @param params 请求返回超链接集合的参数信息
     */
    List<DocumentLink> documentLink(DocumentLinkParams params);

    /**
     * 请求需要进行指定的异步任务，通常将耗时操作写在此处（如代码查错等）
     */
    void doAsyncWork();
}
