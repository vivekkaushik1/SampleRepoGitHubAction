string=""
x=1
j=1
while [ $x -le 10000 ]
do
 rm -rf random*
 string="touch randomfile$((j+x)) && git add . && git commit -m '$((j+x)):randfile_$((j+x))'"
 echo $string
 eval "$string"
 x=$[$x+1]
 sleep 7.0
 git push
 git tag -a Pt7.$((j+x)) -m "vversion Pt1.1$((j+x))"
 git push --tags origin
done
#git push
