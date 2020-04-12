$(function () {
    $.ajax({
        url: "/selList",
        type: "get",
        datType: "json",
        success: function (r) {
            $("#province").append(
                "<option value='0'>请选择:</option>"
            )
            $.each(r.data, function (i, p) {
                $("#province").append(
                    "<option value='" + p.id + "'>" + p.name + "</option>"
                )
            })
            $("#province").on("change", function () {
                var id = $("#province > option:selected").val();
                $.ajax({
                    url: "/selByCity",
                    type: "get",
                    datType: "json",
                    data: {
                        "id": id
                    },
                    success: function (r) {
                        $("#city").empty();
                        $("#city").append(
                            "<option value='0'>请选择:</option>"
                        )
                        $.each(r.data, function (i, c) {
                            $("#city").append(
                                "<option value='" + c.id + "'>" + c.cname + "</option>"
                            )
                        })
                    }
                })
            })
        }
    })
})
