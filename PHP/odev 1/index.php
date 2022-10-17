<?php

function ucgen($par){
    for ($i=0; $i<$par; $i++){
        $sayaç=0;
        while ($sayaç<=$i){
            echo "0";
            $sayaç++;
        }
        echo "<br>";
    }
}
ucgen(5);

?>