package io.github.scave.lsp4a.model.completion;

import java.util.ArrayList;
import java.util.List;

/**
 * 代码提示结果类
 * @author Scave
 */
public class CompletionResult {
    public boolean isIncomplete;
    public List<CompletionItem> items;

    public CompletionResult() {
        this.items = new ArrayList<>();
    }

    public CompletionResult(boolean isIncomplete, List<CompletionItem> items) {
        this.isIncomplete = isIncomplete;
        this.items = items;
    }

    public CompletionItem get(int index) {
        return items.get(index);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public void add(CompletionItem item) {
        items.add(item);
    }

    public void addAll(List<CompletionItem> items) {
        this.items.addAll(items);
    }

    public void addAll(CompletionResult result) {
        this.items.addAll(result.items);
    }
}
