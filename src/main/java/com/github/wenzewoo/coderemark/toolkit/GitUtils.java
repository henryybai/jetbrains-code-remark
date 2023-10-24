package com.github.wenzewoo.coderemark.toolkit;

import com.intellij.openapi.project.Project;
import git4idea.GitLocalBranch;
import git4idea.GitUtil;
import git4idea.repo.GitRepository;

public class GitUtils {
    public static String getCurrentBranchName(Project project) {
        GitRepository repository = GitUtil.getRepositoryManager(project).getRepositoryForFileQuick(project.getBaseDir());
        if (repository != null) {
            GitLocalBranch currentBranch = repository.getCurrentBranch();
            return currentBranch != null ? currentBranch.getName() : null;
        }
        return null;
    }
}