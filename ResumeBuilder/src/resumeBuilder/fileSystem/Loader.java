package resumeBuilder.fileSystem;

import resumeBuilder.storage.Resume;

interface Loader {
public void initialize(String resumeName);
public Resume load();
}
