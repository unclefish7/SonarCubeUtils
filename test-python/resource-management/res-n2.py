f = open("test.txt", "w")
try:
    f.write("hello")
finally:
    f.close()
