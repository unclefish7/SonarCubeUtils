try:
    open("file.txt")
except IOError:
    pass  # 未记录也未抛出
