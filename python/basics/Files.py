txt = open('example.txt', 'r')
if txt.readable():
    print(txt.read())
txt.close()

rwt = open('examples_write.txt', 'w')
if rwt.writable():
    rwt.write('Uday Testing')
rwt.close()

apnd = open('examples_write.txt', 'a')
apnd.write("Kumar Testing")
apnd.close()
