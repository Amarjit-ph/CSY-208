class VideoStoreLauncher {
public static void main(String [] args){
VideoStore store=new VideoStore();
store.addVideo("The Matrix");
store.addVideo("Godfather II");
store.addVideo("Star Wars Episode IV: A New Hope");
store.returnVideo("Godfather II");
store.checkedOut("Godfather II");
store.listInventory();
store.checkedOut("Tarzzan");
store.returnVideo("Godfather II");
store.receiveRating("Godfather II",9);
}}
class VideoStore{
Video videos[] = new Video[10];
int totalVideos=-1;
int indexOfVideo=-1;
public void addVideo(String s){
if(totalVideos+1!=10)totalVideos+=1;
videos[totalVideos]=new Video();
videos[totalVideos].setTitle(s);
System.out.println("New Movie added:"+s);
}
private int findIndex(String s){
indexOfVideo=-1;
for(int i=0;i<=totalVideos;i++){
if(videos[i].getTitle().equals(s)){
indexOfVideo=i;
}}
return indexOfVideo;
}
public void checkedOut(String s){
int ind=findIndex(s);
if(ind==-1){
System.out.println("We don't sell "+s);
}else{
if(videos[ind].getChecked()==1)System.out.println("Movie not available currently");
else {
videos[ind].setChecked();
System.out.println("You Just Bought the Movie: "+videos[ind].getTitle());
}}}
public void returnVideo(String s){
int ind=findIndex(s);
if(ind==-1){
System.out.println("No such movie existed.");
}else{
if(videos[ind].getChecked()==0)System.out.println("Sorry but we didn't sold "+s+" to you, You bought it from some other shop");
else{
videos[ind].returnVideo();
System.out.println("You just successfully returned "+s);
}}}
public void receiveRating(String s,inti){
int ind=findIndex(s);
if(ind==-1){
System.out.println("No such movie existed.");
}else{
videos[ind].setRating(i);
System.out.println("New rating for "+s+" is:"+videos[ind].getRating());
}
}
public void listInventory(){
System.out.println("List of movies we have:");
for(int i=0;i<=totalVideos;i++){
if(videos[i].getChecked()==0)
System.out.println("We have: "+videos[i].getTitle());
}}}
class Video{
String title;
int checked=0,rating=5,n=1,returned=1; //checked=1 means video is sold
public void setTitle(String t){
title=t;
}
public String getTitle(){
return title;
}
public void setChecked(){
checked=1;
}
public int getChecked(){
return checked;
}
public int getRating(){ //rating should be between 0-10
return rating;
}
public void returnVideo(){
checked=0;
}
public void setRating(int r){
rating=(rating*n+r)/(n+1);
n+=1;
}}
