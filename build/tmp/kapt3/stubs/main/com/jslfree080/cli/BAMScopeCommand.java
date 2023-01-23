package com.jslfree080.cli;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/jslfree080/cli/BAMScopeCommand;", "Ljava/lang/Runnable;", "()V", "bamPath", "", "chrPos", "help", "", "refFile", "widthRange", "", "run", "", "bamscope"})
@picocli.CommandLine.Command(name = "bamscope", version = {"bamscope 0.0.2"}, description = {"A command line tool (in Kotlin/JVM) for visualizing BAM alignments."})
public final class BAMScopeCommand implements java.lang.Runnable {
    @picocli.CommandLine.Parameters(index = "0", description = {"Input chromosomal position. ex) chrN:XXXXXXXX"})
    private java.lang.String chrPos;
    @picocli.CommandLine.Parameters(index = "1", description = {"Path to an input bam file. ex) path/to/xxx.bam"})
    private java.lang.String bamPath;
    @picocli.CommandLine.Option(names = {"-help"}, usageHelp = true, description = {"Show this help message and exit."})
    private boolean help = false;
    @picocli.CommandLine.Option(names = {"-ref"}, description = {"Path to a reference fasta. ex) path/to/xxx.fasta"})
    private java.lang.String refFile;
    @picocli.CommandLine.Option(names = {"-width"}, description = {"Width of chromosomal range. default) 50"})
    private int widthRange = 50;
    
    public BAMScopeCommand() {
        super();
    }
    
    @java.lang.Override()
    public void run() {
    }
}