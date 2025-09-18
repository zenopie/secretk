package io.eqoty

import okio.FileSystem
import okio.Path
import okio.Path.Companion.toPath
import okio.fakefilesystem.FakeFileSystem

actual val fileSystem: FileSystem = FakeFileSystem()
actual val snip721MigratableWasmGz: Path =
    "./kotlin/files/snip721_migratable.wasm.gz".toPath()