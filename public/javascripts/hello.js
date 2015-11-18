
jQuery(document).ready(function(){

    var authenticationSuccess = function() { console.log("Successful authentication"); };
    var authenticationFailure = function() { console.log("Failed authentication"); };

    Trello.authorize({
      type: "popup",
      name: "5:15",
      scope: {
        read: true,
        write: true },
      expiration: "never",
      authenticationSuccess,
      authenticationFailure
    });

});