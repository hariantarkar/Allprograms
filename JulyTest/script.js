function Passwordvalidate(str)
{
		let flag=false;
		let span=document.getElementById("passwordMessage");
		const allowSymbol=['@','#','$','&','_'];
	if(str.length < 8)
	{
			span.innerHTML="password at list 8 char";
			span.style.color="red";
			return;
	}
			let digit=false;
			let upper=false;
			let lower=false;
			let symbol=false;
			let isvalid=true;
		for(var i=0;i<str.length;i++)
		{
			const Char=str[i];
			
			const ascii=str.charCodeAt(i);
			
			if(ascii>=48 && ascii<=57) 
			{
				digit=true;
			}
			else if(ascii >=65 && ascii<=90)
			{
				upper=true;
			}
			else if(ascii>=97 && ascii <=122)
			{
				lower=true;
			}
			else if(allowSymbol.indexOf(Char)!==-1)
			{
				symbol=true;
			}
			else
			{
				isvalid=false;
				break;
			}
		}
		
		if(!isvalid)
		{
			span.innerHTML="password contain invalid ";
			span.style.color="red";
			
		}
		if(digit && upper && lower && symbol )
		{
			span.innerHTML="";
			span.style.color="white";
			
		}
		else
		{
			span.innerHTML="include upper,lower digit,symbol";
			span.style.color="red";
		}
}

function ConfumPassword()
{
	const pass1=document.getElementById("passwordMessage").value;
	const confirm=document.getElementById("pass").value;
	let span=document.getElementById("confirmPass");
	
	if(pass1==confirm)
	{
		span.innerHTML="";
		span.style.color="green";
        return;
	}
	else
	{
		span.innerHTML="Password Not match";
		span.style.color="red";
	}
	
}
function validateName(str)
{
		str=str.toLowerCase();
		let flag=true;
		let span=document.getElementById("NameV");
        if(str.length < 3)
     	{
			span.innerHTML="Name at list 3 char";
			span.style.color="red";
			return;
    	}
        //const allowSymbol=[' '];
        //let symbol=false;
	
		
		for(var i=0;i<str.length;i++)
		{
            /*if(allowSymbol.indexOf(Char)!==-1)
			{
				symbol=true;
			}*/
			if(!(str.charCodeAt(i)>=97 && str.charCodeAt(i)<=122 /*&& str.charCodeAt(i)==132*/))     
			{
				flag=false;
			}
		}
		if(flag)
		{
			span.innerHTML="";
			span.style.color="white";
			span.style.padding="20px";
		}
		else
		{
			span.innerHTML="Invalid name:";
			span.style.color="red";
			span.style.padding="20px";
		}
		/*if(symbol )
		{
			span.innerHTML="";
			span.style.color="white";
			
		}*/
}
function validateContact(str)
{
		str=str.toLowerCase();
		let flag=true;
		let span=document.getElementById("c");
        if(str.length != 10)
     	{
			span.innerHTML=" 10 digits exactly.";
			span.style.color="red";
			return;
    	}
		
		for(var i=0;i<str.length;i++)
		{
            if(!(str.charCodeAt(i)>=48 && str.charCodeAt(i)<=57)) 
			{
				flag=false;
			}
        }
		if(flag)
		{
			span.innerHTML="";
			span.style.color="white";
			span.style.padding="10px";
            return;
		}
		else
		{
			span.innerHTML="Only Digit:";
			span.style.color="red";
			span.style.padding="20px";
            return;
            
		}
    
}