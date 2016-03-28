use strict;
use warnings;
use Encode;

my $binfile = "Aslahuddin.bin";

open(my $bf, '<', $binfile) or die;
open(my $fhl, '>', "Aslahuddin1.txt") or die;
my $binv;
while (my $rowb = <$bf>){
	chomp $rowb;
	$binv = pack('B*', $rowb);
	print $fhl "$binv\n";
}
close $bf;
close $fhl
