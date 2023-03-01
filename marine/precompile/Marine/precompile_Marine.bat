call C:\\deployments72\\precompile\\setenv.bat

ECHO OFF
CLS
ECHO.

GOTO EXECUTE
  
:EXECUTE
echo Compiling MarineBusinessRMA.server...
REN "C:\deployments72\precompile\Marine\MarineBusinessRMA_service_0.adb" "MarineBusinessRMA_service_%date:~-4,4%%date:~-7,2%%date:~-10,2%.adb"
if exist "C:\deployments72\precompile\Marine\Adb_Backup\MarineBusinessRMA_service_%date:~-4,4%%date:~-7,2%%date:~-10,2%.adb" del "C:\deployments72\precompile\Marine\Adb_Backup\MarineBusinessRMA_service_%date:~-4,4%%date:~-7,2%%date:~-10,2%.adb"
move /-y "C:\deployments72\precompile\Marine\MarineBusinessRMA_service_%date:~-4,4%%date:~-7,2%%date:~-10,2%.adb" "C:\\deployments72\\precompile\\Marine\\Adb_Backup\\"
java -mx1024m com.blazesoft.server.deploy.tools.NdAdvisorProjectCompiler -server C:\\deployments72\\precompile\\Marine\\MarineBusinessRMA.server

goto end;

:end
echo Program ended