from PIL import Image, ImageDraw, ImageFont

x1 = (20+170)/2
y1 = (5+155)/2
x2 = (120+270)/2
y2 = y1
x3 = (x1 + x2)/2
y3 = (80+230)/2
r  = 150/2

def generate3(n):
    n0 = (n &   1) > 0
    n1 = (n &   2) > 0
    n2 = (n &   4) > 0
    n3 = (n &   8) > 0
    n4 = (n &  16) > 0
    n5 = (n &  32) > 0
    n6 = (n &  64) > 0
    n7 = (n & 128) > 0

    kep = Image.new('RGB', (290,240), (255,255,255))
    fnt = ImageFont.truetype('Pillow/Tests/fonts/FreeMono.ttf', 40)
    d = ImageDraw.Draw(kep)


    for x in range(0, 290):
      for y in range(0, 240):
        b1 = (x-x1)**2 + (y-y1)**2 <= r**2
        b2 = (x-x2)**2 + (y-y2)**2 <= r**2
        b3 = (x-x3)**2 + (y-y3)**2 <= r**2

        if b1:
            if b2:
                if b3:
                    if n3: d.point((x,y), fill=(128,0,0))
                else:
                    if n2: d.point((x,y), fill=(128,0,0))
            else:
                if b3:
                    if n1: d.point((x,y), fill=(128,0,0))
                else:
                    if n0: d.point((x,y), fill=(128,0,0))
        else:
            if b2:
                if b3:
                    if n6: d.point((x,y), fill=(128,0,0))
                else:
                    if n5: d.point((x,y), fill=(128,0,0))
            else:
                if b3:
                    if n4: d.point((x,y), fill=(128,0,0))
                else:
                    if n7: d.point((x,y), fill=(128,0,0))

    d.ellipse([20,5,170,155], outline=(0,0,0))
    d.text((0,5), "A", font=fnt, fill=(0,0,0))
    d.ellipse([120,5,270,155], outline=(0,0,0))
    d.text((265,5), "B", font=fnt, fill=(0,0,0))
    d.ellipse([70,80,220,230], outline=(0,0,0))
    d.text((55,190), "C", font=fnt, fill=(0,0,0))

    nev = "s3-"+str(n)+".png"
    kep.save(nev)

def generate2(n):
    n0 = (n &   1) > 0
    n1 = (n &   2) > 0
    n2 = (n &   4) > 0
    n3 = (n &   8) > 0

    kep = Image.new('RGB', (290,160), (255,255,255))
    fnt = ImageFont.truetype('Pillow/Tests/fonts/FreeMono.ttf', 40)
    d = ImageDraw.Draw(kep)


    for x in range(0, 290):
      for y in range(0, 160):
        b1 = (x-x1)**2 + (y-y1)**2 <= r**2
        b2 = (x-x2)**2 + (y-y2)**2 <= r**2

        if b1:
            if b2:
                if n1: d.point((x,y), fill=(128,0,0))
            else:
                if n0: d.point((x,y), fill=(128,0,0))
        else:
            if b2:
                if n2: d.point((x,y), fill=(128,0,0))
            else:
                if n3: d.point((x,y), fill=(128,0,0))

    d.ellipse([20,5,170,155], outline=(0,0,0))
    d.text((0,5), "A", font=fnt, fill=(0,0,0))
    d.ellipse([120,5,270,155], outline=(0,0,0))
    d.text((265,5), "B", font=fnt, fill=(0,0,0))

    nev = "s2-"+str(n)+".png"
    kep.save(nev)

for i in range(256):
    generate3(i)
for i in range(16):
    generate2(i)
