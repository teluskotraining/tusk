import sys


def read_file(path):
    """Return the contents of the file at `path`."""
    with open(path, "r", encoding="utf-8") as f:
        return f.read()


def main():
    if len(sys.argv) != 2:
        print(f"Usage: python {sys.argv[0]} <file_path>")
        sys.exit(1)

    try:
        print(read_file(sys.argv[1]))
    except FileNotFoundError:
        print(f"Error: file not found: {sys.argv[1]}")
        sys.exit(1)
    except OSError as e:
        print(f"Error reading file: {e}")
        sys.exit(1)


if __name__ == "__main__":
    main()
