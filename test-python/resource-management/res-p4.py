from concurrent.futures import ThreadPoolExecutor
executor = ThreadPoolExecutor()
executor.submit(print, "hello")
