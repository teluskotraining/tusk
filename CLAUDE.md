# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Repository state

Tiny practice repo (`README.md` is just `# tusk.`). There is no build system, test suite, linter, or dependency manifest.

- `read_file.py` — the only code: a stdlib-only CLI that prints a file's contents. Run with `python read_file.py <file_path>` (exits 1 on a missing argument, missing file, or read error).
- `Recipes.txt`, `pizza.txt` — plain-text sample content, useful as inputs for `read_file.py`.

## Git

Develop on the branch assigned for the session (e.g. `claude/python-file-reading-script-0fbpkf`); do not open a pull request unless asked.
