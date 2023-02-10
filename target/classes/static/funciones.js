function eliminar(id){
    swal({
        title: "estas seguro de eliminar el registro?",
        text: "Once deleted, you will not be able to recover this imaginary file!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
      })
      .then((OK) => {
        if (OK) {
            $.ajax({
                url:"/eliminar/"+id,
                succsess: function(res) {
                  console.log(res);
                },
            });
          swal("Poof! Your imaginary file has been deleted!", {
            icon: "success",
          }).then((OK)=>{
            if(OK){
                location.href="/listar";
            }

          });
        } else {
          swal("Your imaginary file is safe!");
        }
      });
}