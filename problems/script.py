import os
d1 = r"C:\Users\ilyas\OneDrive\Desktop\openSrc\javaSnippets\problems\leetcode"
d2 = r"C:\Users\ilyas\OneDrive\Desktop\openSrc\javaSnippets\problems\code_force"
# iterate over files in
# that directory
def remove_files(path):
    for filename in os.listdir(path):
        f = os.path.join(path, filename)
        # checking if it is a file
        if os.path.isfile(f) and ".class" in f:
            os.remove(f)
            print(f"removed {f}")

remove_files(d1)
remove_files(d2)