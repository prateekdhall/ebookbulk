// JavaScript Document

CKEDITOR.plugins.add('ajaxsave',
{
init: function(editor)
{
var pluginName = 'ajaxsave';


editor.addCommand( pluginName,
{
exec : function( editor )
{
alert( "Executing a command for the editor name - " + editor.checkDirty() );


$.post("http://demobulksales.mpstechnologies.com/test/TestServlet", { name: "John", time: "2pm" } );

alert('after ajax post');
},
canUndo : true
});

/*
editor.addCommand(pluginName, 
new CKEDITOR.dialogCommand(pluginName)

);
*/

editor.ui.addButton('Ajaxsave',
{
label: 'Save Ajax',
command: pluginName,
className : 'cke_button_save'
});
}
});