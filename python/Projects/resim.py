import os
import cv2

hastaResim = cv2.imread(input("Resmi Sürükleyiniz."))
cv2.imwrite("c:/Users/OFO/Desktop/resim.png",hastaResim)