
function i=binsearch(arr,x,low,high)
if low>high
    i=-1;
else
    mid=floor((low+high)/2);


    if arr(mid)==x
        i=mid;
    elseif arr(mid)>x
        i=binsearch(arr,x,low,mid-1);
    else
        i=binsearch(arr,x,mid+1,high);
    end
end
arr=[1 2 3 4 5 6 7];
x=5;
i=binsearch(arr,x,1,length(arr));
disp('i=%d\n',i);

