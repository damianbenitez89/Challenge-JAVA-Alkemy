let url = `/characters`

console.log(url)//perdifico la url que quiero hacer la peticion

fetch(url)
.then(response=> response.json())
.then(data=>{
    console.log(data)
    
    let listaPersonajesHTML= ''
    for(let personaje of data){
        
        let personajeHTML= '<div class="card-group " id="personajes"><div class="card p-1" style="width: 18rem;"><img src="'+
                            personaje.imangen+'" class="rounded card-img-top img-fluid" alt="..."> <h5 class="card-title">'+
                            personaje.nombre+'</h5></div>'
        listaPersonajesHTML +=personajeHTML
    }
   

   
    document.querySelector('#personajes').outerHTML =listaPersonajesHTML
    

    
})

.catch(err=>console.log(err))

