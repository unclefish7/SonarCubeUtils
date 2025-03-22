import logging
try:
    open("file.txt")
except IOError as e:
    logging.error("Failed to open file", exc_info=e)
