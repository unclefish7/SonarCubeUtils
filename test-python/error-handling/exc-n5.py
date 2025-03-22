try:
    int("abc")
except ValueError as e:
    print(f"Conversion error: {str(e)}")
