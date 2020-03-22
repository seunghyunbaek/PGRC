package best.hyun.pgrc.type.fourguardiangods

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class BlueDragon : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_bluedragon)
    override val type: PET_TYPE
        get() = PET_TYPE.FOURGUARDIANSOGDS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_bluedragon)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 70
    override val initLvMaxAtk: Int
        get() = 16
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 11
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1558
    override val maxLvMaxAtk: Int
        get() = 370
    override val maxLvMaxDef: Int
        get() = 208
    override val maxLvMaxSpd: Int
        get() = 273
    override val initLvMinHp: Int
        get() = 55
    override val initLvMinAtk: Int
        get() = 13
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 10
    override val maxLvMinHp: Int
        get() = 1347
    override val maxLvMinAtk: Int
        get() = 331
    override val maxLvMinDef: Int
        get() = 170
    override val maxLvMinSpd: Int
        get() = 242
    override val minAllGrowth: Double
        get() = 5.159
    override val maxAllGrowth: Double
        get() = 5.866
}